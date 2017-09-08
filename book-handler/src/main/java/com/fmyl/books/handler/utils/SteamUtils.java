package com.fmyl.books.handler.utils;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * steam utils
 * Created by fuzq on 17/9/4.
 */
public class SteamUtils extends BaseUtil {

    public static void handler(InputStream is, OutputStream out) {
        try {
            byte[] buffer = new byte[512];
            int len = 0;
            while ((len = is.read(buffer)) > 0) {
                out.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    logger.error("", e);
                    is = null;
                }
            }
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    logger.error("", e);
                    out = null;
                }
            }
        }
    }
}
