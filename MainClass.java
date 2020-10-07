public class MainClass {
    public static void main(String [] args)
    {
        CommonResource cm = new CommonResource();

        Runnable p1=new Producer(cm,"Fredi-Producer");
        Runnable p2=new Producer(cm,"Raluca-Producer");
        Runnable p3=new Producer(cm,"Oana-Producer");

        Runnable c1=new Consumer(cm,"Fredi-Consumer");
        Runnable c2=new Consumer(cm,"Raluca-Consumer");
        Runnable c3=new Consumer(cm,"Oana-Consumer");


        Thread thread1=new Thread(p1);
        Thread thread2=new Thread(p2);
        Thread thread3=new Thread(p3);

        Thread thread4=new Thread(c1);
        Thread thread5=new Thread(c2);
        Thread thread6=new Thread(c3);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();


    }
}
