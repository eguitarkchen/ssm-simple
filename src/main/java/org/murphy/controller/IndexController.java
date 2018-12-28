package org.murphy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/")
public class IndexController {
    @RequestMapping(value = "/hi")
    @ResponseBody
    public String hi() {
        return "Hi , welcome here !";
    }


}