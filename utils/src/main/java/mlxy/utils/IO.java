package mlxy.utils;

import android.content.Context;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class IO {
    public static String readStringFromAsset(Context context, String assetName) throws IOException {
        InputStream in = context.getAssets().open(assetName);
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        byte[] buf = new byte[1024];
        int len;
        while ((len = in.read(buf)) != -1) {
            out.write(buf, 0, len);
        }
        out.close();
        in.close();

        return out.toString();
    }
}
