/**
 * Created by DhruvSingh on 24/05/2017.
 */

//Remember that my program is the main thread
//I am now designating a portion of the program as a thread by creating my own thread
//Implementing a Runnable interface is the alternative to inheriting a thread class
    //Only the run method is defined by the runnable interface

public class MyThread implements Runnable {
    Thread t;
    //I have called a constructor when implementing the runnable interface
   //the constructor creates the new thread but does not start it
    //the constructor returns a reference to the new thread
    MyThread(){
        //the word 'this' is a reference to this instance of the class
        t = new Thread(this, "My Thread");
        //the start method calls the run method
        t.start();
    }
    //the run method must be a public method
    //statements within the run method become the portion of the program that executes when the thread executes
    public void run(){
        System.out.println("Child thread started just now but may terminate before main");
        System.out.println("Child thread terminated");
    }
}

    class Demo {//program class creates an instance of the MyThread class
        //this is done by using the NEW operator and calling the constructor of MyThread
    public static void main(String[] args) {
        new MyThread();
        System.out.println("Main Thread Started");
        System.out.println("Main Thread Terminated");
        System.out.println("Trying this again just to make sure I am confident");
    }
}
