package com.itheima.service;

import com.itheima.pojo.Account;

import java.util.List;

public interface IAccountService {

    //保存用户
    void saveAccount(Account account);
    //查找所有用户
    List<Account> findAll();
    //转账
    void transfor(Integer id1,Integer id2,Double money);
}
