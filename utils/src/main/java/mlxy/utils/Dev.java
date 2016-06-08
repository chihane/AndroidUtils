package mlxy.utils;

import android.content.Context;

public class Dev {
    public static int dp2px(Context context, float dp) {
        return (int) Math.ceil(context.getResources().getDisplayMetrics().density * dp);
    }

    public static int sp2px(Context context, float sp) {
        return (int) Math.ceil(context.getResources().getDisplayMetrics().scaledDensity * sp);
    }
}
