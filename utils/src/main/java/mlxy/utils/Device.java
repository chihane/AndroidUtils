package mlxy.utils;

import android.content.Context;

public class Device {
    public int dp2px(Context context, float dp) {
        return (int) Math.ceil(context.getResources().getDisplayMetrics().density * dp);
    }
}
