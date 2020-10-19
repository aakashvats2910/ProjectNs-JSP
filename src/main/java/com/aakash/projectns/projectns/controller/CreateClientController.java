package com.aakash.projectns.projectns.controller;

import com.aakash.projectns.projectns.database.ClientRepository;
import com.aakash.projectns.projectns.database.JDBCClient;
import com.aakash.projectns.projectns.entity.ClientDatabaseEntity;
import com.aakash.projectns.projectns.extras.RegisterClientHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class CreateClientController extends HttpServlet {

    private ClientRepository clientRepository;

    @RequestMapping(value = "/registerclient", method= RequestMethod.GET)
    public String getLoginWindow() {
        System.out.println("()()()() EFGH EFGH");
        return "/registerclient";
    }

    @RequestMapping(value = "/registerclient", method = RequestMethod.POST)
    public String postRegisterWindow(@ModelAttribute(name = "registerclientform") RegisterClientHandler resgisterClientHandler, Model model) {

        ClientDatabaseEntity clientDatabaseEntity = new ClientDatabaseEntity();
        clientDatabaseEntity.setUsername(resgisterClientHandler.getUsernamefield());
        clientDatabaseEntity.setAddress(resgisterClientHandler.getAddressfield());
        clientDatabaseEntity.setClientId(resgisterClientHandler.getClientidfield());
        clientDatabaseEntity.setEmail(resgisterClientHandler.getEmailfield());
        clientDatabaseEntity.setPosition(resgisterClientHandler.getPositionfield());
        clientDatabaseEntity.setPassword(resgisterClientHandler.getPasswordfield());

        System.out.println("()()()() ABCD ABCD");

        System.out.println("()()()() " + clientDatabaseEntity.toString());

        try {
            JDBCClient.saveClientInfo(clientDatabaseEntity);
        } catch (Exception e) {
            System.out.println("()()()() ERROR : " + e.getLocalizedMessage());
        }

//        clientRepository.save(clientDatabaseEntity);

        return "/registerclient";
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("()()()() SOMETHING SOMETHING");
        String username = req.getParameter("usernamefield");
        System.out.println("()()()() USRNM : " + username);
    }
}
