package mlxy.utils;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class Clip {
    public static void copy(Context context, CharSequence text) {
        copy(context, "label", text);
    }

    public static void copy(Context context, CharSequence label, CharSequence text) {
        manager(context).setPrimaryClip(ClipData.newPlainText(label, text));
    }

    public static CharSequence pasteLatest(Context context) {
        ClipData data = manager(context).getPrimaryClip();
        ClipData.Item item = data.getItemAt(0);
        return item.getText();
    }

    public static List<CharSequence> paste(Context context) {
        ClipData data = manager(context).getPrimaryClip();
        List<CharSequence> result = new ArrayList<>();
        for (int i = 0; i < data.getItemCount(); i++) {
            ClipData.Item item = data.getItemAt(i);
            CharSequence text = item.getText();
            result.add(text);
        }
        return result;
    }

    private static ClipboardManager manager(Context context) {
        return (ClipboardManager) context.getSystemService(Context.CLIPBOARD_SERVICE);
    }
}
