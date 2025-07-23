package classEx_0722;

public class Score {

	
	
	int kor;
	int eng; 
	int math;

	public int printScore() {
		int score = kor + eng + math; //총점 this. 사용해도 괜츈
		return score;
	}	
	
	// double score1 = score / 3.0 도 가능
	public double printScore1() {
		double score1 = (kor + eng + math) / 3; //평균
		return score1;
	}


	
	}	
	

