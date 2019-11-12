package com.jbit.bankoline.mapper;

import com.jbit.bankoline.pojo.Account;
import org.apache.ibatis.annotations.Param;

public interface AccountMapper {
    //登录的方法
    public Account login(Account account);

    //查询余额
    public Account seeMOney(@Param("cardno") Integer cardno);
}
