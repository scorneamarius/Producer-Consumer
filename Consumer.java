public class Consumer implements Runnable {
    CommonResource cm;
    String name ;
    public Consumer(CommonResource cm,String name)
    {
        this.cm=cm;
        this.name=name;
    }
    public void run()
    {
        try {
            cm.consume("Message from "+this.name);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
