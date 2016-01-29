package mlxy.utils;

import android.content.Context;
import android.os.Environment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class F {

    public static File create(File file) throws IOException {
        if (file == null) {
            return null;
        }

        File parent = file.getParentFile();
        if (!parent.exists()) {
            parent.mkdirs();
        }
        file.createNewFile();
        return file;
    }

    public static File createTempFile(Context context, String filename) {
        try {
            return File.createTempFile(filename, null, getCacheDir(context));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static File getCacheDir(Context context) {
        if (Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)) {
            return context.getExternalCacheDir();
        } else {
            return context.getCacheDir();
        }
    }

    public static File getFileDir(Context context) {
        if (Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)) {
            return context.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
        } else {
            return context.getFilesDir();
        }
    }

    public static boolean delete(File file) {
        boolean deleted = false;

        if (file != null) {
            if (file.isFile()) {
                deleted = file.delete();
            }
        }

        return deleted;
    }

    public static boolean copy(File from, File to) {
        if (from == null || to == null) {
            return false;
        }

        if (!from.isFile() || !from.canRead()) {
            return false;
        }

        boolean copied = false;

        FileInputStream input = null;
        FileOutputStream output = null;
        try {
            if (!to.isFile()) {
                create(to);
            }

            input = new FileInputStream(from);
            output = new FileOutputStream(to);

            byte[] buf = new byte[1024];
            int len;
            while ((len = input.read(buf)) != -1) {
                output.write(buf, 0, len);
            }

            copied = true;
        } catch (IOException e) {
            e.printStackTrace();
            copied = false;
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (output != null) {
                try {
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return copied;
    }
}
