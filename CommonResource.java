public class CommonResource {
    public String message;
    public int acces =0 ; // 0 -> au acces producerii
                        // 1- > au acces consumerii

    public synchronized void produce (String message) throws InterruptedException
    {
        while(acces==1)
        {
            wait();
        }
        acces=1;
        this.message=message;
        System.out.println(this.message);
        notifyAll();
    }

    public synchronized void consume(String message) throws InterruptedException
    {
        while(acces==0)
        {
            wait();
        }
        acces=0;
        this.message=message;
        System.out.println(this.message);
        notifyAll();
    }

}
