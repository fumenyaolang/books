package com.fmyl.books.handler.utils;

import java.io.File;

/**
 * Created by fuzq on 17/9/7.
 */
public class FileUtils {

    public File getFile(String filePath) {
        return new File(filePath);
    }

    /**
     * 创建目录
     *
     * @param path
     * @return
     */
    public static boolean mkdir(String path) {
        File file = new File(path);
        if (file.exists()) {
            return true;
        }
        return file.mkdir();
    }

}
