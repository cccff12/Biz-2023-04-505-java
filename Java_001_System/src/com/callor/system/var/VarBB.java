package com.callor.system.var;

public class VarBB {
	public static void main(String[] args) {
		int intNum1 = 0;
		float floatNum1 = 0.0f;
		double douNum1=0;
		
		intNum1 = 10;
		floatNum1 = intNum1 + 10;//20.0f
		floatNum1=floatNum1+1.2f;
		System.out.println(floatNum1);

		floatNum1=floatNum1+0.5f;
		System.out.println(floatNum1);
		
		//java는 
		//float를 int로 강제형 변환할때
		//소수점 이하를 무조건 절사한다(버린다)
		intNum1=(int)floatNum1;
		System.out.println(intNum1);
		
		floatNum1=intNum1;
		floatNum1=(float)douNum1;

	}
}
