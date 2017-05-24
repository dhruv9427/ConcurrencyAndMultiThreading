/**
 * Created by DhruvSingh on 24/05/2017.
 */
public class MyThread implements Runnable {
    Thread t;
    MyThread(){
        t = new Thread(this, "My Thread");
        t.start();
    }
    public void run(){
        System.out.println("Child thread started");
        System.out.println("Child thread terminated");
    }
}

    class Demo {
    public static void main(String[] args) {
        new MyThread();
        System.out.println("Main Thread Started");
        System.out.println("Main Thread Terminated");
        System.out.println("Trying this again just to make sure I am confident");
    }
}
