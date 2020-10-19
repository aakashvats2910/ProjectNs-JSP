package com.aakash.projectns.projectns.controller;

import com.aakash.projectns.projectns.extras.LoginHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String getLoginWindow() {
        return "/login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String postLoginWindow(@ModelAttribute(name = "loginform")LoginHandler loginHandler, Model model) {

        System.out.println("()()()() LOGIN LOGIN");

        String username = loginHandler.getUsernamefield();
        String password = loginHandler.getPasswordfield();

        if (username.equals("admin") && password.equals("12345")) {
            return "/adminpageclient";
        }

        if (username.equals("client") && password.equals("67890")) {
            return "/clienthome";
        }

        return "/login";

    }

}
