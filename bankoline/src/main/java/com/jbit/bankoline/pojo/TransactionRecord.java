package com.jbit.bankoline.pojo;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Data
public class TransactionRecord {
    private Integer id;
    private String cardno;
    private Date transactionDate;
    private Double expense;
    private Double income;
    private double balance;
    private String transactionType;
    private String remark;

}
