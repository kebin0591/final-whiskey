package com.whiskey.rvcom.misc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/")
    public String getMain() {
        return "main";
    }

    @GetMapping("/sub")
    public String getSub() {
        return "sub";
    }
}