

public class Main {

	public static void main(String[] args) {
		service s = new service();
		movies j = new movies("Jumanji: Welcome to the jungle","Fantasy", "12a");
		movies h = new movies("Harry Potter and the order of the pheonix", "Adventure", "PG");	
		movies a = new movies("Avengers: Age of Ultron", "Action", "15");
		movies b = new movies("Spectre", "Action", "18");
		
		 
				
		s.addMovies(1,j);	
		s.addMovies(2, h);
		s.addMovies(3, a);
		s.addMovies(4, b);
		
		System.out.println(s.getMovies(1));
		System.out.println(s.getMovies(3));
	}


}
