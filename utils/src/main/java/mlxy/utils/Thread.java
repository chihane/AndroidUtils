package mlxy.utils;

public class Thread {
    public static void sleep(long millis) {
        try {
            java.lang.Thread.sleep(millis);
        } catch (InterruptedException ignored) {}
    }
}
