package com.callor.bank.exec;

import com.callor.bank.service.BankService;

public class DBExecF {
	public static void main(String[] args) {

		BankService bservice= new BankService();
		
		bservice.inserAccList();
	}
}
