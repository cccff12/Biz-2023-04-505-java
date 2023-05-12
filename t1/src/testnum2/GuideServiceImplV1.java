package testnum2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GuideServiceImplV1 implements GuideService {

	List<GuideDto> list;

	public GuideServiceImplV1() {
		list = new ArrayList<>();
	}

	public void loadGuide() {
		Scanner scan = null;
		InputStream is = null;
		String str = "src/txt/guide.txt";
		try {
			is = new FileInputStream(str);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		scan = new Scanner(is);
		while (scan.hasNext()) {
			String strr = scan.nextLine();
			String[] Guide = strr.split(",");
			GuideDto gdto = new GuideDto();
			gdto.id = Guide[0];
			gdto.name = Guide[1];
			gdto.num = Guide[2];
			gdto.guide = Guide[3];
			list.add(gdto);
		}

	}

	public void printGuideList() {
		System.out.println("=".repeat(80));
		System.out.printf("%-5s\t%-5s\t%-3s\t%-5s\n", "id", "종목명", "순서", "방법");
		System.out.println("-".repeat(80));
		int num = 0;
		for (GuideDto dto : list) {
			System.out.printf("%-5s\t", dto.id);
			System.out.printf("%-5s\t", dto.name);
			System.out.printf("%-5s\t", dto.num);
			System.out.printf("%-5s\n", dto.guide);
			num++;
			if (num == 4) {
				System.out.println("-".repeat(80));
			} else if (num == 7) {
				System.out.println("-".repeat(80));
			} else if (num == 12) {
				System.out.println("=".repeat(80));
			} else if (num > 12 && num % 5 == 0) {
				System.out.println("-".repeat(80));
			}
		}

	}

}
