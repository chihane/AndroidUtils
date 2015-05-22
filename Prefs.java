/** SharedPreferences简易存取。 */
public class Prefs {
    /**
     * 向首选项中设置值。</br>
     *
     * value的实际类型需要是<b>boolean</b>、<b>float</b>、<b>int</b>、<b>long</b>、<b>String</b>之一，否则不作处理。
     * */
    public static void put(Context context, String key, Object value) {
        Editor editor = context.getSharedPreferences(context.getPackageName(), Context.MODE_PRIVATE).edit();

        if (value instanceof Boolean) {
            editor.putBoolean(key, (Boolean) value);
        } else if (value instanceof Float) {
            editor.putFloat(key, (Float) value);
        } else if (value instanceof Integer) {
            editor.putInt(key, (Integer) value);
        } else if (value instanceof Long) {
            editor.putLong(key, (Long) value);
        } else if (value instanceof String) {
            editor.putString(key, (String) value);
        } else {
            // 按说应该抛异常。
        }

        editor.commit();
    }

    /** 从首选项中取值。 */
    @SuppressWarnings("unchecked")
    public static <P> P get(Context context, String key, P defValue) {
        SharedPreferences prefs = context.getSharedPreferences(context.getPackageName(), Context.MODE_PRIVATE);

        Object result = null;

        if (defValue instanceof Boolean) {
            result = prefs.getBoolean(key, (Boolean) defValue);
        } else if (defValue instanceof Float) {
            result = prefs.getFloat(key, (Float) defValue);
        } else if (defValue instanceof Integer) {
            result = prefs.getInt(key, (Integer) defValue);
        } else if (defValue instanceof Long) {
            result = prefs.getLong(key, (Long) defValue);
        } else if (defValue instanceof String) {
            result = prefs.getString(key, (String) defValue);
        }

        return (P) result;
    }
}
