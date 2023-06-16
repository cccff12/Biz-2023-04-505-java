package com.callor.shop.service;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.shop.model.BuyerDto;
import com.callor.shop.model.IolistDto;
import com.callor.shop.model.ProductDto;
import com.callor.shop.service.impl.BuyerServiceimplV1;
import com.callor.shop.service.impl.IolistServiceimplV1;
import com.callor.shop.service.impl.ProductServiceimplV1;

public class ShopingcartService {
	ProductService productservice;
	IolistService ioservice;
	BuyerService buyerservice;
	Scanner scan;

	public ShopingcartService() {
		super();
		buyerservice = new BuyerServiceimplV1();
		productservice = new ProductServiceimplV1();
		ioservice = new IolistServiceimplV1();
		scan = new Scanner(System.in);
	}

	public void productlist() {
		List<ProductDto> list = productservice.selectAll();
		System.out.println("상품코드\t상품명\t품목\t매입단가\t매출단가");
		System.out.println("-".repeat(70));
		for (ProductDto dto : list) {
			System.out.print(dto.pCode + "\t");
			System.out.print(dto.pName + "\t");
			System.out.print(dto.pItem + "\t");
			System.out.print(dto.pIPrice + "\t\t");
			System.out.print(dto.pOPrice + "\n");
		}

	}

	public void productin() {
		while (true) {
			System.out.println("상품정보 등록");
			System.out.println("-".repeat(70));
			System.out.println("상품코드>>");
			String stcode = scan.nextLine();
			if (stcode.equals("QUIT")) {
				return;
			}
			ProductDto proDto = productservice.findBypCode(stcode);
			if (proDto != null) {
				System.out.println(stcode + "상품정보 있음 상품수정으로 변환 ");
				productupdate();
				return;
			} else {
				System.out.println("상품정보 없음 등록시작");
			}
			System.out.println("상품명>>");
			String stname = scan.nextLine();
			if (stname.equals("QUIT")) {
				return;
			}

			System.out.println("품목>>");
			String stitem = scan.nextLine();
			if (stitem.equals("QUIT")) {
				return;
			}
			System.out.println("매입단가>>");
			String stpirice = scan.nextLine();
			if (stpirice.equals("QUIT")) {
				return;
			}
			ProductDto newproDto = new ProductDto();
			newproDto.pCode = stcode;
			newproDto.pName = stname;
			newproDto.pItem = stitem;
			newproDto.pIPrice = Integer.valueOf(stpirice);
			int poprice = Integer.valueOf(stpirice);
			poprice = (int) (poprice * 0.22);

			while (poprice % 10 != 0) {
				++poprice;
				if (poprice % 10 == 0) {
					break;
				}
			}
			System.out.println(stpirice + "의 판매단가 : " + poprice);
			newproDto.pOPrice = poprice;
			productservice.insert(newproDto);
		}
	}

	public void productupdate() {

		System.out.println("상품수정");
		System.out.println("수정할 상품 코드를 입력하세요");
		String stcode;
		ProductDto prodto;
		while (true) {
			
			stcode = scan.nextLine();
			if (stcode.equals("QUIT")) {
				return;
			}
			prodto = productservice.findBypCode(stcode);
			if (prodto == null) {
				System.out.println("없는 상품임");
				continue;
			}
			break;
		}
System.out.println("코드입력");
		String stpcode = scan.nextLine();
		if (!stpcode.equals(""))
			prodto.pCode = stpcode;
		System.out.println("이름입력");
		String stname = scan.nextLine();
		if (!stname.equals(""))
			prodto.pName = stname;
		System.out.println("상품명입력");
		String stitem = scan.nextLine();
		if (!stitem.equals(""))
			prodto.pItem = stitem;
		System.out.println("매입단가입력");
		String piprice = scan.nextLine();
		if (!piprice.equals(""))
			prodto.pIPrice = Integer.valueOf(piprice);

		int poprice = Integer.valueOf(piprice);
		poprice = (int) (poprice * 0.22);

		while (poprice % 10 != 0) {
			++poprice;
			if (poprice % 10 == 0) {
				break;
			}
		}
		System.out.println(piprice + "의 판매단가 : " + poprice);

		prodto.pOPrice = poprice;

		int result = productservice.update(prodto);
		if (result > 0)
			System.err.println("변경완료");
		else
			System.out.println("변경실패");
	}

	public void buyerprint() {
		List<BuyerDto> buyerlist = new ArrayList<>();
		buyerlist = buyerservice.selectAll();
		System.out.println("고객 정보 리스트");
		System.out.println("아이디\t이름\t전화번호\t주소");
		for (BuyerDto dto : buyerlist) {
			System.out.print(dto.buId + "\t");
			System.out.print(dto.buName + "\t");
			System.out.print(dto.buTel + "\t");
			System.out.print(dto.buAddr + "\n");
		}
		System.out.println("-".repeat(70));

	}

	public void buyerinsert() {
		System.out.println("-".repeat(70));
		System.out.println("고객정보 등록");
		System.out.println("-".repeat(70));

		System.out.println("고객 id입력");
		String stid = scan.nextLine();
		String.format("%010s", stid);

		System.out.println("고객 이름입력");
		String stname = scan.nextLine();

		System.out.println("고객 전화입력");
		String sttel = scan.nextLine();

		System.out.println("고객 주소입력");
		String staddr = scan.nextLine();

		BuyerDto dydto = new BuyerDto();
		dydto.buId = stid;
		dydto.buName = stname;
		dydto.buTel = sttel;
		dydto.buAddr = staddr;
		buyerservice.insert(dydto);

	}

	public void shopinglist() {

		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
		SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");

		String dateString = dateFormat.format(date);
		String timeString = timeFormat.format(date);

		String stid;
		BuyerDto budto;
		buyerprint(); // 고객 전체리스트
		while (true) {
			System.out.println("고객 id입력");
			stid = scan.nextLine();
			budto = buyerservice.findById(stid);
			if (budto == null) {
				System.out.println("id없음");
				continue;
			}
			break;
		} // 입력한 id가 없으면 나올때까지 반복

		String stcode;
		ProductDto prodto;

		productlist();// 상품 전체 리스트
		while (true) {
			System.out.println("상품코드 입력");
			stcode = scan.next();
			prodto = productservice.findBypCode(stcode);
			if (stcode == null) {
				System.out.println("code없음");
				continue;
			}
			break;
		} // 입력한 code가 없으면 나올때까지 반복
		int poprice;
		ProductDto pdto;
		System.out.println("상품단가를 새로 입력하시려면 1을 입력하고, 아니면 아무키나 입력해주세요");
		String stproductsell = scan.nextLine();
		if (stproductsell.equals("1")) {
			System.out.println("새로 입력하려는 상품단가의 가격을 입력해 주세요");
			pdto = productservice.findBypCode(stcode);
			String pprice = scan.nextLine();
			pdto.pIPrice = Integer.valueOf(pprice);
			poprice = Integer.valueOf(pprice);
			poprice = (int) (poprice * 0.22);
			while (poprice % 10 != 0) {
				++poprice;
				if (poprice % 10 == 0) {
					break;
				}
			}
			pdto.pOPrice = poprice; // 상품단가는 기본적으로 쓰되 새로 입력하려면 임의로 등록
		}

		
		IolistDto ioDto = new IolistDto();
		ioDto.ioDate = dateString;// 날자
		ioDto.ioTime = timeString;// 시간
		ioDto.ioBuId = stid;// 고객 id
		ioDto.ioPCode = Integer.valueOf(stcode);// 상품코드
		ioDto.ioQuan = 20;

				System.out.println("=".repeat(70));
		System.out.println("상품판매 리스트");
		System.out.println("=".repeat(70));
		System.out.println("거래일자\t거래시각\t고객id\t고객이름\t전화번호\t상품코드\t상품명\t판매단가\t수량\t판매합계");
		System.out.print(ioDto.ioDate + "\t");
		System.out.print(ioDto.ioTime + "\t");
		System.out.print(ioDto.ioBuId + "\t");
		System.out.print(ioDto.ioPCode + "\t");
		System.out.println(ioDto.ioQuan + "\t");
		System.out.println(ioDto.ioPrice + "\n");

	}

}
