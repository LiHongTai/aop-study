package com.roger.dao.impl;

import com.roger.dao.IndexDao;
import org.springframework.stereotype.Service;

@Service
public class IndexDaoImpl implements IndexDao {

    @Override
    public void query() {
        System.out.println("beign exe the business ....");
    }

    @Override
    public void queryByKey(String key) {
        System.out.println("传递的参数为："  + key);
    }
}
