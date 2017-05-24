/**
 * Created by DhruvSingh on 24/05/2017.
 */
public class Demo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Current thread: " + t);
        t.setName("Diva Thread");
        System.out.println("Renamed thread: " + t);
    }
}
