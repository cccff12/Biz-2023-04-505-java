package com.callor.classes.module;

public class ServiceB {
public void score(ScoreDto score) {
	
	System.out.println("학번 : "+score.stNum);
	System.out.println("이름 : "+score.stName);
	System.out.println("국어 : "+score.intKor);
	System.out.println("영어 : "+score.intEng);
	System.out.println("수학 : "+score.intMath);
	System.out.println("국사 : "+score.intHistory);
	System.out.println("음악 : "+score.intMusic);
	System.out.println("미술 : "+score.intArt);
	System.out.println("체육 : "+score.intSport);

	/*
	 * int intTotal = score.intkor; intTotal += score.intEng; intTotal +=
	 * score.intMath; intTotal += score.intMusic; intTotal += score.intHistory;
	 * intTotal += score.intArt; intTotal += score.intSport;
	 */
float floatAvg=(float)total/3;
System.out.println("총점:"+ total);
System.out.println("평균:"+ floatAvg);

}
	
	
	
	
}
