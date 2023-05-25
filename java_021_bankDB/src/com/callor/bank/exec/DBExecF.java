package com.callor.bank.exec;

import com.callor.bank.service.BankService2;

public class DBExecF {
	public static void main(String[] args) {

		BankService2 bservice= new BankService2();
		
		bservice.inserAccList();
	}
}
