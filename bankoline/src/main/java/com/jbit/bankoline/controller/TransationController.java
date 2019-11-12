package com.jbit.bankoline.controller;

import com.jbit.bankoline.pojo.Account;
import com.jbit.bankoline.service.AccountServiceImpl;
import com.jbit.bankoline.util.Constants;
import com.jbit.bankoline.util.JsonMsg;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/transation")
public class TransationController {


    //打开index 页面
    @RequestMapping(value = "/index")
    public String index() {
        return "index";
    }

}
