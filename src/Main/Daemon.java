package Main;

public class Daemon extends Thread{
    public void run(){
        Process p=new Process();
        Process p1 = new Process();
        p.setDaemon(false);
        p1.setDaemon(false);
        p.setPriority(Thread.MIN_PRIORITY);
        p1.setPriority(Thread.MAX_PRIORITY);
        p1.start();
        p.start();
    }
}
