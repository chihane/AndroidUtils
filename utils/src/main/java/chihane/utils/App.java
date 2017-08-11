package chihane.utils;

import android.content.Context;
import android.content.pm.PackageManager;

public class App {
    public static final int APP_VERSION_INVALID = -1;

    public static int versionCode(Context context) {
        int appVersion = APP_VERSION_INVALID;
        try {
            appVersion = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            appVersion = APP_VERSION_INVALID;
        }
        return appVersion;
    }

    public static String versionName(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
