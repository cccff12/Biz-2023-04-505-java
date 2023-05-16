package java_800_ExamA.service;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java_800_ExamA.GuideDto;
import java_800_ExamA.index;

public class GuideServiceImplv1 implements Guide {

	protected final List<GuideDto> guideList;

	public GuideServiceImplv1() {
		this.guideList = new ArrayList<>();
	}

	public void loadGuide() {
		String guideFile = "src/java_800_ExamA/guide.txt";
		InputStream is = null;
		Scanner scan = null;

		try {
			is = new FileInputStream(guideFile);
		} catch (Exception e) {
			// TODO: handle exception
		}
		scan = new Scanner(is);

		int rows = 0;
		while (scan.hasNext()) {
			String line = scan.nextLine();
			String[] guide = line.split(",");
			GuideDto guDto = new GuideDto();
			try {
				guDto.id = guide[index.GUIDE.GU_ID];
				guDto.item = guide[index.GUIDE.GU_ITEM];
				guDto.seq = Integer.valueOf(guide[index.GUIDE.GU_SEQ]);
				guDto.guide = guide[index.GUIDE.GU_GUIDE];
				guideList.add(guDto);
			} catch (Exception e) {
				System.out.println(rows + "번째에서 exception발생");
			}

		}
		scan.close();
		System.out.println("로딩된 데이터 개수: " + guideList.size());
	}

	public void printGuide() {
		System.out.println("=".repeat(150));
		System.out.println("id\t종목명\t순서\t가이드");
		System.out.println("-".repeat(150));

		String id = null;

		for (GuideDto dto : guideList) {
			if (id != null && !id.equals(dto.id)) {
				System.out.println("-".repeat(150));
			}
			id= dto.id;

			System.out.printf("%s\t", dto.id);
			System.out.printf("%s\t\t", dto.item);
			System.out.printf("%d\t\t", dto.seq);
			System.out.printf("%s\n", dto.guide);

		}

	}

}
