package com.ashish.ThreeCardPoker.controller;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GameController {
    @RequestMapping("/hello")
    public String Calc(Model model)
    {
        return "helloworld";
    }
}
