package com.jbit.bankoline.service;

import com.jbit.bankoline.mapper.AccountMapper;
import com.jbit.bankoline.pojo.Account;
import com.jbit.bankoline.util.Constants;
import org.apache.ibatis.annotations.Param;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Service
@Configuration
public class AccountServiceImpl {
    @Resource
    private AccountMapper accountMapper;

    public Account login(Account account) {
        //无账户
        return accountMapper.login(account);
    }

    public Account seeMOney(Integer cardno) {
        //无账户
        return accountMapper.seeMOney(cardno);
    }

}
