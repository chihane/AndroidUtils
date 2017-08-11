package chihane.utils;

import android.content.Context;
import android.widget.Toast;

/** Simplified {@link Toast}. */
public class T {
    /** Show long Toast.
     *
     *  @see Toast#makeText(Context, CharSequence, int)
     *  @see Toast#LENGTH_LONG
     */
    public static void showLong(Context context, CharSequence text) {
        Toast.makeText(context.getApplicationContext(), text, Toast.LENGTH_LONG).show();
    }

    /** Show short Toast.
     *
     *  @see Toast#makeText(Context, CharSequence, int)
     *  @see Toast#LENGTH_SHORT
     */
    public static void showShort(Context context, CharSequence text) {
        Toast.makeText(context.getApplicationContext(), text, Toast.LENGTH_SHORT).show();
    }
}