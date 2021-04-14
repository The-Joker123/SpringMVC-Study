package com.zeng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerTest2 {

    @RequestMapping("/test")
    public String Test1(Model model){
        model.addAttribute("msg","控制");

        return "test";

    }
}
