package com.callor.bank.exec;

import java.io.PrintWriter;

import com.callor.bank.service.BuyerService;
import com.callor.bank.service.impl.BuyerServiceImplV1A;

public class BuyerExecA {
	public static void main(String[] args) {
		BuyerService buService = new BuyerServiceImplV1A();

	buService.inputBuyer();

		/*
		 * printBuyerList()에 전달할 출력방향을 화면으로 지정하여 전달 PrintWriter out= new
		 * PrintWriter(System.out);
		 * 
		 * 내 파일에 전달하기 OutputStream os= new FileOutputStream("내파일"); PrintWriter out new
		 * PrintoutStream();
		 */

		// PrintWriter out= new PrintWriter(System.out);
		// buService.printBuyerList();
		// out.close();

		buService.printBuyerList();
		buService.loadBuyer();
		
		
	}

}
