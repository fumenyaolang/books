package com.fmyl.books.handler.utils;

import com.fmyl.books.handler.constant.Keys;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

/**
 * Created by fuzq on 17/9/7.
 */
public class PropertiesUtils extends BaseUtil {

    private final static String HOME_PROPERTIES_PATH = "/etc/book-path.properties";

    public static String getHome() {
        try {
            return getProperties(HOME_PROPERTIES_PATH).getProperty(Keys.BOOK_HOME);
        } catch (IOException e) {
            logger.error("", e);
        }
        return "";
    }

    public static Properties getProperties(String path) throws IOException {
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(path);
        properties.load(new InputStreamReader(fileInputStream,"UTF-8"));
        fileInputStream.close();
        return properties;
    }

}
