package com.aakash.projectns.projectns.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BrainstormingController {

    @RequestMapping(value = "/brainstorming", method= RequestMethod.GET)
    public String getLoginWindow() {
        return "/brainstorming";
    }

}
