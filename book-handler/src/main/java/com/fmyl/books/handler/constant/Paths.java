package com.fmyl.books.handler.constant;

import com.fmyl.books.handler.utils.PropertiesUtils;

/**
 * Created by fuzq on 17/9/4.
 */
public class Paths {
    public static final String BOOK_HOME = PropertiesUtils.getHome();
    public static final String DOWN_DIR = "download";
    public static final String PROPERTIES_NAME = "book.properties";


    public static String getDownload() {
        return BOOK_HOME + DOWN_DIR;
    }

    public static String getPropertiesPath() {
        return BOOK_HOME + PROPERTIES_NAME;
    }

}
