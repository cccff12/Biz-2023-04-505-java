package com.callor.classes;
/*
 * 클래스 B에서 클래스A의 기능을 상속
 * 
 * 클래스 B에는 아무런 method가 정의되지 않았지만
 * 클래스 A를 상속받아 클래스 A의 method(2개) 들이 
 * 정의된 것처럼 사용 가능하다
 * 
 * 
 * 객체지향 프로그래밍에서 클래스를 상속받기
 * 기존에 잘 만들어진 클래스 코드가 있으면, 그 클래스 코드를 
 * 내가 만든 클래스에서 사용하고 싶을때 
 * classA가 잘 만든 클래스라고 한다면
 * classB는 A의 메서드를 물러 받아 사용 가능하다.
 * 만약 원해 classA 개발자가 코드를 UPGRADE하면 
 * 클래스 B도 같이 업그래이드 되는 효과를 낼 수 있다.
 * 
 */
public class ClassB extends ClassA{

	
	/*
	 * java에서 클래스의 상속(extend)
	 * java에서 클래스의 상속은 부모 클래스의 장점을 그대로 물려 받으면서 
	 * 필요에 따라 method를 다시 재 정의하여 사용할수 있는 기능이다.
	 */
	
	@Override
	public void add(int num1, int num2) {
		System.out.printf("%d+%d=%d\n",num1,num2,num1+num2); // 재정의: 상속받은 매서드를 자의로 바꾸는 것
	
	
	}
/*
 * Object를 상속받는 모든 클래스는 
 * 기본적으로 toString() method가 있다.
 * 기본 toString () method 클래스의 패키지명, 메모리 주소 등을 
 * 문자열로 return한다.
 * 
 * 기본 toString() method 코드는 실제로 별 효용이 없다
 * 일반적으로 toString ()각 class 에서 재 정의하여 사용한다.
 */
	@Override
	public String toString() {
		return "나는 원래 toString ()method를 재 정의 한 것이다";
	}

	
	
	
}
