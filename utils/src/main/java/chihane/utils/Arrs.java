package chihane.utils;

public class Arrs {
    public static boolean isEmpty(Object[] array) {
        return array == null || array.length == 0;
    }

    public static boolean notEmpty(Object[] array) {
        return array != null && array.length > 0;
    }

    public static <I> I lastItem(I[] items) {
        return isEmpty(items) ? null : items[items.length - 1];
    }
}
