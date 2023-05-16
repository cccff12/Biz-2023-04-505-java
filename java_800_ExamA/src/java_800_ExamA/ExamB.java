package java_800_ExamA;

import java_800_ExamA.service.Guide;
import java_800_ExamA.service.GuideServiceImplv1;

public class ExamB {
public static void main(String[] args) {
	Guide guService= new GuideServiceImplv1();
	guService.loadGuide();
	guService.printGuide();
	
	
}
}
