package org.sid.ebankingbackend.dtos;

import lombok.Data;

@Data
public class AccountBankResponseDTO {
	
	private Long id;
	private double balance;
    private String type;
    private double rate;
    private CustomerDTO customer;

}
