/**
 * Created by DhruvSingh on 24/05/2017.
 */
public class Demo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Current thread: " + t);
        t.setName("DKS Thread");
        System.out.println("Renamed thread: " + t);
        System.out.println("GitHub Changes");
        System.out.println("Trying this again just to make sure I am confident");
    }
}
