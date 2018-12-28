package org.murphy.controller;

import org.murphy.service.DemoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping(value = "/")
public class IndexController {
    @Resource
    private DemoService demoService;

    @RequestMapping(value = "/hi")
    @ResponseBody
    public String hi() {
        return "Hi , welcome here !";
    }

    @RequestMapping(value = "/getData")
    @ResponseBody
    public String getData() {
        List<?> list = demoService.QueryData();
        //other operations
        return list.size() > 0 ? "get data" : "no data";
    }
}
