package Main;
//thin thread uses the resources inside the thread it is in
//thick thread uses the resources directly from the scheduler
// a weak thread is the manager that manages the threads: DAEMON THREAD

//a daemon thread takes the managment from the main thread
// is a service provider
//manages the threads
//thin
//it is terminated by the garbage collector
// the garbage collector is a daemon thread
//they do nothing
//they are usefull
// when all the threads created by the user die, all the daemon thread get killed by the garbage colelctor and dies
//die=the thread is removed from the ram stack

//the extension is more invasive
//the implementation, i build my thread on an interface,

public class Main {
    public static int contatore= 0;
    public static void main(String[] args) {
        // the main manages the threads
        // the priority belong to the scheduler
        //but the scheduler doesn't manage the threads
        // so the main gives no fuck about priorities
        // a daemon is on the same level as a the main thread, so it's just underneath the jvm
//        Daemon daemon = new Daemon();
//        daemon.setDaemon(true);
//        daemon.start();
//        try {
//            daemon.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//
        Process process= new Process();
        process.start();
    }
}
