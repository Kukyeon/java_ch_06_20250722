package classEx_0722;

public class Movie {

	
	
	String title;
	String genre; 
	int runtime;
	
	
	
	public boolean isLongMovie() {
		if ( runtime  >= 120 ) {
			return true;
		} else { 
			return false;
		}
	}
	
	
	
	
}
