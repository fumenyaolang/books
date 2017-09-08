package com.fmyl.books.handler.utils;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by fuzq on 17/9/7.
 */
public class SpringBeanUtils {

    public static Object getBean(Class clazz) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.properties");
        return context.getBean(clazz);
    }
}
