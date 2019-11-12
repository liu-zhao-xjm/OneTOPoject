package com.jbit.bankoline.pojo;

import lombok.Data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Data
public class Account {
    private String cardno;
    private String password;
    private double balance;
    private Integer status;
}
