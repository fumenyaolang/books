package com.fmyl.books.handler.controller;

import com.fmyl.books.handler.constant.Paths;
import com.fmyl.books.handler.utils.DownloadUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by fuzq on 17/8/29.
 */
@RestController
@RequestMapping("/download")
public class DownloadController {

    @RequestMapping(value = "/url", method = RequestMethod.POST)
    public Map<String, Object> byUrl(@RequestParam(value = "url", defaultValue = "") String url) {
        Map<String, Object> map = new HashMap();
        try {
            map.put("state", DownloadUtils.download(new URL(url), Paths.getDownload(), "11.html"));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return map;
    }
}
