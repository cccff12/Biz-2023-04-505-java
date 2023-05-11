import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import test.BookDto;

public class Service implements service1 {

	List<BookDto> list;

	public Service() {
		list = new ArrayList<>();
	}

	public void lord() {

		String str = "src/bookfile/도서정보(2023-05-11).txt";
		Scanner scan = null;
		InputStream is = null;
		try {
			is = new FileInputStream(str);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		scan = new Scanner(is);
		while (scan.hasNext()) {
			String book = scan.nextLine();
			String[] bb = book.split(",");
			BookDto bd = new BookDto();
			bd.setISBN(bb[index.in.num0]);
			bd.setBookname(bb[1]);
			bd.setPlace(bb[index.in.num2]);
			bd.setAuthor(bb[3]);
			bd.setAuthor(bb[4]);
			bd.setPage(Integer.valueOf(bb[index.in.num5]));
			bd.setPrice(Integer.valueOf(bb[6].trim()));
		list.add(bd);
		}

	}

	public void print() {
		System.out.printf("%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t\n", "isbn","책이름","장소" ,"작가","뭔날짜","페이지","가격");
		System.out.println("^".repeat(80));
		for(BookDto b: list) {
			System.out.printf("%s\t", b.getISBN());
			System.out.printf("%s\t", b.getBookname());
			System.out.printf("%s\t", b.getPlace());
			System.out.printf("%s\t", b.getAuthor());
			System.out.printf("%s\t", b.getDay());
			System.out.printf("%s\t", b.getPage());
			System.out.printf("%s\n", b.getPlace());
			
		}
		System.out.println("^".repeat(80));
		
		
	}

}
