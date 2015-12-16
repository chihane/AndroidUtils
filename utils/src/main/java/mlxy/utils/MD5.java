package mlxy.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 {
    public static String encode(String src) {
        String hash = null;

        try {
            byte[] md5 = MessageDigest.getInstance("md5").digest(src.getBytes());

            StringBuilder builder = new StringBuilder();
            for (byte b : md5) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    builder.append('0');
                }

                builder.append(hex);
            }
            hash = builder.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        return hash;
    }
}
