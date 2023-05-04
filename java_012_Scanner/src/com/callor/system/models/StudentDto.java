package com.callor.system.models;

/*
 * 클래스의 맴버변수, 맴버 method
 * 맴버**: 현재의 클래스 scope 내부에서 선언된 변수, method
 * 맴버변수의 다른 이름: field, attribute, 속성, 객체변수
 * Dto 클래스의 맴버 변수의 접근 제한자
 * 접근제한자는 public private protected 가 있는데
 * 맴버변수, 맴버 메소드에 접근제한자가 없을때
 * 1. package가 다른 곳에서 맴버** 에 접근하려고 하면 접근이 안된다.(접근제한자가 있어야 하는 이유)
 * 2. public 접근 제한자가 있으면 package에 관계없이 현재 프로젝트의 어떤 곳에서든 접근이 가능하다.
 *3.  private *접근제한자가 있으면 현재 클래스의 맴버 method에서만 접근이 가능하다. 
 */
// public: 어디서든 사용 가능, private : 현재 메소드만 사용 가능

/*
 * Dto 클래스의 맴버 변수와 getter setter method
 * java의 프로젝트 패턴에서 Dto클래스의 맴버 변수는 모두 private선언
 * 
 * private 로 선언된 맴버 변수에 값을 저장, 읽기 위하여 
 * setter, getter method를 선언한다.
 * 
 * Dto 클래스를 객체로 생성한 후 맴버 변수에 접근하기 위하여 
 * 맴버 변수를 직접 호명하지 않고 
 * setter getter method를 통해 접근한다.
 */
// 정보은닉, 캡슐화: private 되어있어 직접 접근하지 않고 간접적으로 getter setter로 접근한다.
public class StudentDto {

	// public: 어디서든 사용 가능, private : 현재 메소드만 사용 가능
	
	private String stNum;// 클래스 안에 있으면 맴버변수, field, 객체변수
	private String stName;
	private String stDept;
	private int stGrade;
	private String stTel;
	// private를 쓰기 위해 getter setter 를 씀
	public String getStNum() {
		return stNum;
	}
	public void setStNum(String stNum) {
		this.stNum = stNum;
	}
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public String getStDept() {
		return stDept;
	}
	public void setStDept(String stDept) {
		this.stDept = stDept;
	}
	public int getStGrade() {
		return stGrade;
	}
	public void setStGrade(int stGrade) {
		this.stGrade = stGrade;
	}
	public String getStTel() {
		return stTel;
	}
	public void setStTel(String stTel) {
		this.stTel = stTel;
	}
	/*
	 * studentDto클래스로 선언한 객체의 맴버 변수(속성) 에 저장된 값을
	 * 문자열로 만들어 return해주는 method
	 * 
	 * 개발자가 정의한 클래스를 사용하여 객체변수를 생성하면 
	 * 기본적으로 toString() 이라는 method가 자동 생성된다.
	 *  단, to String () method는 소스코드에 나타나지 않는다.
	 *  하지만 객체 . toString 처럼 method를 사용할 수 있다.
	 *  원래 toString() method는 객체의 정보중에서 메모리 주소 등을 
	 *  알려주는 문자열을 생성하여 return하는 코드가 들어있다.
	 *  
	 *  기본적으로 toString() method가 retrun하는 문자열은 별로
	 *  효용(필요) 가치가 없다.
	 *  그래서, 원래의 toString () method코드를 감춰버리고 
	 *  맴버변수의 값을 문자열로 만들어서 return 하는 method로 
	 *  재 정의 (override)했다
	 */
	@Override
	public String toString() {
		return "StudentDto [stNum=" + stNum + ", stName=" + stName + ", stDept=" + stDept + ", stGrade=" + stGrade
				+ ", stTel=" + stTel + "]";
	}
	
	
	// 마우스 오른쪽 눌러서 소스 들어가면 메뉴 뜸
	
	
	
	
	
	
	
}
