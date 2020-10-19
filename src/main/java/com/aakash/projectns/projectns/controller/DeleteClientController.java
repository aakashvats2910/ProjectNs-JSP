package com.aakash.projectns.projectns.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DeleteClientController {

    @RequestMapping(value = "/deleteclient", method= RequestMethod.GET)
    public String getDeleteClientWindow() {
        return "/deleteclient";
    }

}
