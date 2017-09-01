package com.fmyl.books.handler.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fuzq on 17/8/29.
 */
@RestController
@RequestMapping("/download")
public class DownloadController {

    @RequestMapping(value = "/url",method = RequestMethod.POST)
    public String byUrl(@RequestParam(value = "url",defaultValue = "") String url){

        return url;
    }
}
