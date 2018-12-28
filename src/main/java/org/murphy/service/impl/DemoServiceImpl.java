package org.murphy.service.impl;

import org.murphy.dao.DemoDao;
import org.murphy.service.DemoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service(value = "indexService")
public class DemoServiceImpl implements DemoService {
    @Resource
    private DemoDao demoDao;

    @Override
    public List<?> QueryData() {
        return demoDao.QueryUsers();
    }
}
