package com.roger.test;

import com.roger.config.AppConfig;
import com.roger.dao.IndexDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TestAop {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext annoConfigAppContext = new AnnotationConfigApplicationContext(AppConfig.class);

        IndexDao indexDao = annoConfigAppContext.getBean(IndexDao.class);

        indexDao.query();

        indexDao.queryByKey("Roger");

    }



}
