public class Demo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Current thread : " + t);
        t.setName("Dhruv Singh Thread");
        System.out.println("Renamed Thread : " + t);

    }



}
