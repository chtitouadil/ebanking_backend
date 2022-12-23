package org.sid.ebankingbackend.dtos;

import java.util.Date;

import org.sid.ebankingbackend.entities.Customer;
import org.sid.ebankingbackend.enums.AccountStatus;

import lombok.Data;

@Data
public class AccountBankRequestDTO {
	
    private double balance;
    private String type;
    private double rate;
    private CustomerDTO customer;

}
