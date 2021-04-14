package com.zeng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RestFulController {

    @RequestMapping("/add/{a}/{b}")
    public String restfulTest(@PathVariable int a, @PathVariable int b, Model model){
        int res=a+b;
        model.addAttribute("msg",res);
        return "test";
    }

}
