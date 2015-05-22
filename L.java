import android.util.Log;

/** Simplified {@link android.util.Log}. */
public class L {
    public static final String TAG_VERBOSE = "Verbose";
    public static final String TAG_DEBUG = "Debug";
    public static final String TAG_INFO = "Info";
    public static final String TAG_WARN = "Warning";
    public static final String TAG_ERROR = "Error";
    public static final String TAG_WTF = "WTF";

    /** Ugly but it works. */
    private static String toStr(Object msg) {
        if (msg instanceof String ||
            msg instanceof Integer ||
            msg instanceof Boolean ||
            msg instanceof Long ||
            msg instanceof Double ||
            msg instanceof Float ||
            msg instanceof Byte ||
            msg instanceof Character ||
            msg instanceof Short
            ) {
            return msg+"";
        } else if (msg == null) {
            return "null";
        } else {
            return msg.toString();
        }
    }

    /** <p>Send {@linkplain Log#VERBOSE VERBOSE} log message in <b>primitive data types</b> or <b>String</b> as String literally,<br/>
     *  send <code>msg.toString()</code> for other types.</p>
     *  F**k, I don't speak English. I rewrote the sentence above over 10 times.<br/>Enough.<br/>Whatever.
     *
     *  @param msg The message you would like to log.
     *  @see Log#v(String, String)
     */
    public static void v(Object msg) {
        Log.v(TAG_VERBOSE, toStr(msg));
    }

    /** <p>Send {@linkplain Log#DEBUG DEBUG} log message in <b>primitive data types</b> or <b>String</b> as String literally,<br/>
     *  send <code>msg.toString()</code> for other types.</p>
     *
     *  @param msg The message you would like to log.
     *  @see Log#d(String, String)
     */
    public static void d(Object msg) {
        Log.d(TAG_DEBUG, toStr(msg));
    }

    /** <p>Send {@linkplain Log#INFO INFO} log message in <b>primitive data types</b> or <b>String</b> as String literally,<br/>
     *  send <code>msg.toString()</code> for other types.</p>
     *
     *  @param msg The message you would like to log.
     *  @see Log#i(String, String)
     */
    public static void i(Object msg) {
        Log.i(TAG_INFO, toStr(msg));
    }

    /** <p>Send {@linkplain Log#WARN WARN} log message in <b>primitive data types</b> or <b>String</b> as String literally,<br/>
     *  send <code>msg.toString()</code> for other types.</p>
     *
     *  @param msg The message you would like to log.
     *  @see Log#w(String, String)
     */
    public static void w(Object msg) {
        Log.w(TAG_WARN, toStr(msg));
    }

    /** <p>Send {@linkplain Log#ERROR ERROR} log message in <b>primitive data types</b> or <b>String</b> as String literally,<br/>
     *  send <code>msg.toString()</code> for other types.</p>
     *
     *  @param msg The message you would like to log.
     *  @see Log#e(String, String)
     */
    public static void e(Object msg) {
        Log.e(TAG_ERROR, toStr(msg));
    }

    /** <p>Send WTF log message in <b>primitive data types</b> or <b>String</b> as String literally,<br/>
     *  send <code>msg.toString()</code> for other types.</p>
     *
     *  @param msg The message you would like to log.
     *  @see Log#v(String, String)
     */
    public static void wtf(Object msg) {
        Log.wtf(TAG_WTF, toStr(msg));
    }
}
