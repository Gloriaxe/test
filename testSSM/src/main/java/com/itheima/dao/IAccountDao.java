package com.itheima.dao;

import com.itheima.pojo.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface IAccountDao {

    @Insert("insert into account(name,money) values(#{name},#{money})")
    void saveAccount(Account account);

    @Select("select * from account ")
    List<Account> findAll();

    @Select("select * from account where id = #{value}")
    Account findOneById(Integer id);

   @Update("update account set money=#{money} where id =#{id}")
    void updateAccount(Account account);
}
