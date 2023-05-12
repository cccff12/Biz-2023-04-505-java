package testnum2;

public class exec {
	public static void main(String[] args) {
		
	
	GuideService v=new GuideServiceImplV1();
v.loadGuide();
v.printGuideList();
	
	}
}