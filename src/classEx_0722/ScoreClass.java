package classEx_0722;

public class ScoreClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Score sco1 = new Score(); 
		sco1.kor = 90;
		sco1.eng = 90; 
		sco1.math = 90;
		
		
		
		
		
		int score1 = sco1.printScore();
		
		System.out.println("총 점 : " + score1);
		
		double score2 = sco1.printScore1();
		
		System.out.println("평 균 : " + score2);
		
		if(score2 >= 90) {
			System.out.println("우수");
		} else if(60 < score2) {
			System.out.println("보통");
		}else if(60 > score2) {
			System.out.println("재시험");
		}
	}

}

