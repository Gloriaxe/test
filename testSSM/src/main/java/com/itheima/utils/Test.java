package com.itheima.utils;

import com.itheima.pojo.Account;
import com.itheima.service.impl.AccountServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountServiceImpl accountService = ac.getBean("accountService", AccountServiceImpl.class);
        List<Account> all = accountService.findAll();
        System.out.println(all);
    }
}
