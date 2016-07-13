package mlxy.utils;

import android.content.Context;
import android.view.WindowManager;

public class Dev {
    public static int dp2px(Context context, float dp) {
        return (int) Math.ceil(context.getResources().getDisplayMetrics().density * dp);
    }

    public static int sp2px(Context context, float sp) {
        return (int) Math.ceil(context.getResources().getDisplayMetrics().scaledDensity * sp);
    }

    public static int screenWidth(Context context) {
        WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        return wm.getDefaultDisplay().getWidth();
    }

    public static int screenHeight(Context context) {
        WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        return wm.getDefaultDisplay().getHeight();
    }
}
