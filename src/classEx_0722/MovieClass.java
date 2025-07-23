package classEx_0722;

public class MovieClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		Movie art1 = new Movie();
		art1.title = "herryporter"; 
		art1.genre = "fantasy";
		art1.runtime = 300;

		boolean fancy = art1.isLongMovie();
		System.out.println("긴 영화인가요? : " + fancy);
		
		
	}
	
}
