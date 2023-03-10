package Main;

public class Process extends Thread{
    public void run(){
        while(true) {
            System.out.println("hi i am a thread");
            System.out.println("my name is: " + currentThread().getName() + " Priority: " + currentThread().getPriority());
            System.out.println("contatore: "+Main.contatore);
            //currentthread returns a thread, and getname returns a string
            Main.contatore++;
        }
    }
}
