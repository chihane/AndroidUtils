package mlxy.utils;

import android.content.Context;
import android.net.ConnectivityManager;

public class Network {
    public static boolean connected(Context context) {
        ConnectivityManager connManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        return connManager.getActiveNetworkInfo() != null && connManager.getActiveNetworkInfo().isAvailable();
    }
}
