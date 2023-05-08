package d;

public class ss {
	public class ScoreServiceV1 {
		
		// 각 과목의 총점을 합산하기 위한 변수 선언
		private int intKor = 0;
		private int intEng = 0;
		private int intMath = 0;
		private int intMusic = 0;
		private int intArt = 0;
		private float floatAvg = 0.0f;
		
		
		private ScoreDto[] scoreList; 
		
		public void setScoreList(ScoreDto[] scoreList) {
			this.scoreList = scoreList;
		}
		
		
		private int getScore() {
			return (int)(Math.random() * 50) + 51;
		}
		
		
		public void scoreRndMake() {
			for(int i = 0; i < scoreList.length ; i++) {
				
				// 23*** 형식의 학번 생성하기
				String stNum = String.format("23%03d", i+1);
				
				// 생성한 학번 각 학생의 성적 객체에 등록하기
				scoreList[i].stNum = stNum;
				scoreList[i].scKor = getScore();
				scoreList[i].scEng = getScore();
				scoreList[i].scMath = getScore();
				scoreList[i].scMusic = getScore();
				scoreList[i].scArt = getScore();
			}
		}
		
		public void scoreListPrint() {	
			
			System.out.println("=".repeat(70));
			System.out.println("한울 고교 성적처리 시스템 2023");
			System.out.println("-".repeat(70));
			System.out.println("학번\t국어\t영어\t수학\t음악\t미술\t총점\t평균");
			System.out.println("-".repeat(70));
			for(int i = 0; i < scoreList.length ; i++) {
				System.out.print(scoreList[i].stNum + "\t");
				System.out.printf("%5d\t",scoreList[i].scKor);
				System.out.printf("%5d\t",scoreList[i].scEng);
				System.out.printf("%5d\t",scoreList[i].scMath);
				System.out.printf("%5d\t",scoreList[i].scMusic);
				System.out.printf("%5d\t",scoreList[i].scArt);
				System.out.printf("%5d\t",scoreList[i].getTotal());
				System.out.printf("%5.2f\n", scoreList[i].getAvg());
			}
			System.out.println("-".repeat(70));
		}
		public void scoreTotalPrint() { 


			for(int i = 0 ; i < scoreList.length ; i++) {
				intKor += scoreList[i].scKor;
				intEng += scoreList[i].scEng;
				intMath += scoreList[i].scMath;
				intMusic += scoreList[i].scMusic;
				intArt += scoreList[i].scArt;
				
				
				floatAvg += scoreList[i].getAvg();
			}
			System.out.print("총점\t");
			System.out.printf("%5d\t",intKor);
			System.out.printf("%5d\t",intEng);
			System.out.printf("%5d\t",intMath);
			System.out.printf("%5d\t",intMusic);
			System.out.printf("%5d\t",intArt);
			
			int intTotal = intKor;
			intTotal += intEng;
			intTotal += intMath;
			intTotal += intMusic;
			intTotal += intArt;
			System.out.printf("%5d\n",intTotal);
		}
		public void scoreAvgPrint() { 	
			
			System.out.print("평균\t");
			System.out.printf("%5.2f\t", (float)intKor / scoreList.length);
			System.out.printf("%5.2f\t", (float)intEng / scoreList.length);
			System.out.printf("%5.2f\t", (float)intMath / scoreList.length);
			System.out.printf("%5.2f\t", (float)intMusic / scoreList.length);
			System.out.printf("%5.2f\t\t", (float)intArt / scoreList.length);
			System.out.printf("%5.2f\n", floatAvg / scoreList.length);
			System.out.println("=".repeat(70));
		}

	}
}
