package com.fmyl.books.handler.controller;

import com.fmyl.books.handler.constant.Paths;
import com.fmyl.books.handler.utils.DownloadUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by fuzq on 17/8/29.
 */
@RestController
@RequestMapping("/search")
public class SearchController {

    public static void main(String[] args) {
        URL url = null;
        try {
            url = new URL("http://www.qu.la/book/3623/");
            DownloadUtils.download(url, Paths.getDownload(), "help");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
