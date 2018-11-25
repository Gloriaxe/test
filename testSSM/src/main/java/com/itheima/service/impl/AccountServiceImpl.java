package com.itheima.service.impl;

import com.itheima.dao.IAccountDao;
import com.itheima.pojo.Account;
import com.itheima.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements IAccountService {
    @Autowired
    private IAccountDao accountDao;
    @Override
    public void saveAccount(Account account) {
        accountDao.saveAccount(account);
    }

    @Override
    public List<Account> findAll() {
        List<Account> list = accountDao.findAll();
        return list;
    }

    public void transfor(Integer id1,Integer id2,Double money){
        Account account1 = accountDao.findOneById(id1);
        Account account2 = accountDao.findOneById(id2);
        if (money==null||money>account1.getMoney()){
            return;
        }
        account1.setMoney(account1.getMoney()-money);
        accountDao.updateAccount(account1);
        int i=1/0;
        account2.setMoney(account2.getMoney()+money);
        accountDao.updateAccount(account2);
    }


}
