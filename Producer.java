public class Producer implements Runnable {
    CommonResource cm;
    String name;
    public Producer(CommonResource cm , String name)
    {
        this.cm=cm;
        this.name=name;
    }
    public void run(){
        try {
            cm.produce("Message from "+this.name);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
