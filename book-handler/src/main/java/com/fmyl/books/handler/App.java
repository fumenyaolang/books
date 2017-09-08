package com.fmyl.books.handler;

import com.fmyl.books.handler.constant.Paths;
import com.fmyl.books.handler.service.SearchService;
import com.fmyl.books.handler.service.impl.SearchPropertiseServiceImpl;
import com.fmyl.books.handler.utils.DownloadUtils;
import com.fmyl.books.handler.utils.SpringBeanUtils;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

/**
 * Created by fuzq on 17/9/7.
 */
public class App {

    public static void main(String[] args) {
        try {
            SearchService searchService = (SearchService) SpringBeanUtils.getBean(SearchPropertiseServiceImpl.class);
            List<String> paths = searchService.getHomeUrlPath();
            for (String path : paths) {
                DownloadUtils.download(new URL(path), Paths.getDownload(), "1111", "home.html");
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
