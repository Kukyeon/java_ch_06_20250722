package classEx_0722;

public class Score {

	
	
	int kor;
	int eng; 
	int math;

	public int printScore() {
		int score = kor + eng + math; //총점
		return score;
	}	
	
	
	public double printScore1() {
		double score1 = (kor + eng + math) / 3; //평균
		return score1;
	}


	
	}	
	

