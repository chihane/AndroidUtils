package mlxy.utils;

public class Th {
    public static void sleep(long millis) {
        try {
            java.lang.Thread.sleep(millis);
        } catch (InterruptedException ignored) {}
    }
}
