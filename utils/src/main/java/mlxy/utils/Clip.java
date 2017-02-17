package mlxy.utils;

import android.annotation.TargetApi;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;

public class Clip {
    public static void copy(Context context, CharSequence text) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
            copy(context, text);
        } else {
            android.text.ClipboardManager manager = (android.text.ClipboardManager) context.getSystemService(Context.CLIPBOARD_SERVICE);
            manager.setText(text);
        }
    }

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static void copy(Context context, CharSequence label, CharSequence text) {
        ClipboardManager manager = (ClipboardManager) context.getSystemService(Context.CLIPBOARD_SERVICE);
        manager.setPrimaryClip(ClipData.newPlainText(label, text));
    }
}
