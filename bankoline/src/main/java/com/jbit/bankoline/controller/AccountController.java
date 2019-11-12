package com.jbit.bankoline.controller;

import com.jbit.bankoline.pojo.Account;
import com.jbit.bankoline.service.AccountServiceImpl;
import com.jbit.bankoline.util.Constants;
import com.jbit.bankoline.util.JsonMsg;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/account")
public class AccountController {
    @Resource
    private AccountServiceImpl accountService;

    @PostMapping(value = "/login")
    // @ResponseBody //返回json数据
    public JsonMsg login(Account account, HttpServletRequest request) {
        Account account1 = accountService.login(account);
        String name = null;
        if (account1 == null) {
            System.out.println("无账户！！！！！");
            name = "你输入的账户不存在";
        } else if (!account.getPassword().equals(account1.getPassword())) {
            System.out.println("密码不正确");
            name = "登录失败！你输入的密码不正确";
        } else if (account1.getStatus() == 0) {
            System.out.println("账户已经冻结");
            name = "登录失败！账户已经冻结！！";
        } else {
            System.out.println("登录成功");
            request.getSession().setAttribute(Constants.USER_SESSION, account1);
            System.out.println("执行成功");
            return JsonMsg.success();
        }
        return JsonMsg.fail().addInfo("login_error", name);

    }

}
