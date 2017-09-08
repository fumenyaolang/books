package com.fmyl.books.handler.utils;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * download utils
 * Created by fuzq on 17/9/4.
 */
public class DownloadUtils extends BaseUtil {

    public static boolean download(URL url, String downloadPath, String newFileName) {
        try {
            URLConnection conn = url.openConnection();
            InputStream is = conn.getInputStream();
            OutputStream out = new FileOutputStream(downloadPath + "/" + newFileName);
            SteamUtils.handler(is, out);
        } catch (MalformedURLException e) {
            logger.error("", e);
            return false;
        } catch (IOException e) {
            logger.error("", e);
            return false;
        }
        return true;
    }

    public static boolean download(URL url, String downloadPath, String menuName, String newFileName) {
        try {
            URLConnection conn = url.openConnection();
            InputStream is = conn.getInputStream();
            String path =downloadPath + "/" + menuName + "/";
            FileUtils.mkdir(path);
            OutputStream out = new FileOutputStream(path+ newFileName);
            SteamUtils.handler(is, out);
        } catch (MalformedURLException e) {
            logger.error("", e);
            return false;
        } catch (IOException e) {
            logger.error("", e);
            return false;
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
