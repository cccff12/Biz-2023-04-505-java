package com.callor.classrs.exec;
/*
 * JAVA의 class
 * "객체지향 프로그래밍" 방법론적인 부분에서
 * 가장 표준적인 코딩 스타일
 * 
 * java는 모든 코드가 기본적으로 class로 부터 시작한다.
 * 
 * java의 소스코드는 .java라는 이름으로 파일이 저장되지만
 * "java 클래스 파일" 이라고 명명한다.
 * 
 * method들이 포함되고, 변수들이 포함된다. method만 
 * 있는 클래스 파일이 있고, 변수들만 있는 클래스 파일이 있고
 * method와 변수가 함께 있는 파일이 있다.
 * 
 * 코드를 테스트하고 실행하기 위해 main() method를 작성한다
 * main() method를 진입점, 시작점 method라고 하며 main()method를 포함하는
 * java class 코드를 진입점 코드 라고 한다
 * 
 */
public class ExecA {
	

	
	public static void main(String[] args) {
		//한개의 정수형 변수를 만들고 51~100까지 랜덤수로 초기화하기		
		
		int num1=(int)(Math.random()*50)+51;
		//여러개의 정수형 변수 배열을 선언하고 
		//10개를 생성해 배열을만든다.
		int [] nums=new int[10];
		//생성된 배열에 정수값을 저장하기
		//배열에 값을 저장하기 위해서는 배열의 index를 지정
		//배열[index]
		//[index]는 항상 0부터 시작한다
		//배열의 index끝 값은 (배열의 길이)-1
		nums[0]=100; //nums배열 0번 위치에 정수 100 저장
		nums[1]=100;
		nums[2]=(int)(Math.random()*50)+(int)(Math.random()*50);
		nums[3]=(int)(Math.random()*50)+(int)(Math.random()*50);
		nums[4]=(int)(Math.random()*50)+(int)(Math.random()*50);
		nums[5]=(int)(Math.random()*50)+(int)(Math.random()*50);
		nums[6]=(int)(Math.random()*50)+(int)(Math.random()*50);
		nums[7]=(int)(Math.random()*50)+(int)(Math.random()*50);
		nums[8]=(int)(Math.random()*50)+(int)(Math.random()*50);
		nums[9]=(int)(Math.random()*50)+(int)(Math.random()*50);
	
	//nums배열의 3번 index에 저장된 값을 읽어서 num1변수에 저장하라
		num1=nums[3];
		
		//nums배열의 index에 저장된 값을 읽어서
		//console에 저장하라
		System.out.println(nums[5]);
		
	}
	
	
}
