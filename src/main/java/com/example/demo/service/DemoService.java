package com.example.demo.service;


import com.example.demo.dao.DemoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DemoService {

    private DemoDao demoDao;

    @Autowired
    public void setDemoDao(DemoDao demoDao) {
        this.demoDao = demoDao;
    }
    public Map<String, Object> selectList(Map<String, Object> param) throws Exception {
        HashMap returnMap = new HashMap();
        List<Map<String,Object>> list = demoDao.selectList(param);
        returnMap.put("list", list);
        return returnMap;
    }
}
