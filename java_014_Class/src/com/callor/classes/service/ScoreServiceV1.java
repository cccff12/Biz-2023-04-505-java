package com.callor.classes.service;

import java.util.List;

import com.callor.classes.models.ScoreDto;

public class ScoreServiceV1 {
//	학생수를 10명으로 설정하기 위한 변수 선언문
	private int classSize = 10;

	/*
	 * 매개변수로 일반 변수가 아닌 참조형 객체변수를 사용한다. 참조형 객체변수는 실제 저장된 값이 전달되는 것이 아니고 기억장소의 주소가
	 * 전달된다.
	 * 
	 * main() method에서 보낼때 scoreList의 주소가 전달되고 makeScore() 에서 값을 변경시키면 main()method의
	 * scoreList가 같이 변경되는 성질을 갖게 된다.
	 */
	public void makeScore(List<ScoreDto> scoreList) {
		for (int i = 0; i < classSize; i++) {
//		001 002 형식으로 학번 문자열 만들기
			String stNum = String.format("%03d", i + 1);
			int scKor = (int) (Math.random() * 50) + 51;
			int scMath = (int) (Math.random() * 50) + 51;
			int scMusic = (int) (Math.random() * 50) + 51;
			int scArt = (int) (Math.random() * 50) + 51;
			/*
			 * 
			 * 배열에서는 먼저 배열을 선언하고, 배열을 초기화 하고 , 각 요소에 데이터를 저장한다
			 * 
			 * List type에서는 1.먼저 비어있는 (blank) List type을 생성하고 2. Dto 객체변수를 생성하고 3. Dto각 변수에
			 * 값을 setting(setter) 4. List에 Dto를 add
			 */

		
		}
	}// makeScore end

	public void printScore(List<ScoreDto> scList) {

		System.out.println("=".repeat(70));
		System.out.println("학번\t국어\t수학\t음악\t미술\t총점");
		System.out.println("-".repeat(70));
		for (int i = 0; i < scList.size(); i++) {
			//get. 은 리스트를 쓸때 따라오는 것
			System.out.print(scList.get(i).getStNum() + "\t");
			System.out.print(scList.get(i).getScKor() + "\t");
			System.out.print(scList.get(i).getScMath() + "\t");
			System.out.print(scList.get(i).getScMusic() + "\t");
			System.out.print(scList.get(i).getScArt() + "\t");
			System.out.print(scList.get(i).getTotal() + "\n");

		}

	}
	
	public void prit(List<ScoreDto> list) {//ScoreDto type의 객체변수 list
		for(int i=0;i<list.size();i++) {
		System.out.print(list.get(i).getScKor());
		
		
		
		}
		
	}
	

//	scList 데이터를 총점을 기준으로 오름차순 정렬하기
//	scList 의 객체 데이터에서 getTotal() 값을 기준으로 비교하고
//	scLIST의 객체 요소를 교환하기
	
	public void sortScore(List<ScoreDto> sclist) {

		for (int i = 0; i < sclist.size(); i++) {
			for (int u = 0; u < sclist.size(); u++) {
				if (sclist.get(i).getTotal() > sclist.get(u).getTotal()) {
				 sclist.get(u).getTotal();
					sclist.get(i).getTotal();
					
					
				}
			}

		}

	}

	public void add(int num1, int num2) {
		num1 = 1000;
		num2 = 2000;
	}

}
