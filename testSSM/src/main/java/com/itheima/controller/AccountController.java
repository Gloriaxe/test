package com.itheima.controller;

import com.itheima.pojo.Account;
import com.itheima.pojo.TransforInfo;
import com.itheima.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller("accountController")
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private IAccountService accountService;
    @RequestMapping("/findAll")
    public String findAll(Model model){
        List<Account> list = accountService.findAll();
        model.addAttribute("accounts",list);
        accountService.findAll();
        return "list";
    }
    @RequestMapping("/saveAccount")
    public void saveAccount(Account account, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println( account);
        accountService.saveAccount(account);
        request.getRequestDispatcher("/account/findAll").forward(request,response);
    }
    @RequestMapping("/transfor")
    public String transfor(TransforInfo info){
        accountService.transfor(info.getId1(),info.getId2(),info.getMoney());
        return "forward:/account/findAll";
    }

}
