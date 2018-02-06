

public class Main {

	public static void main(String[] args) {
		Service service = new Service();
		
		Movies movie1 = new Movies("Jumanji: Welcome to the jungle","Fantasy", "12a");
		Movies movie2 = new Movies("Harry Potter and the order of the pheonix", "Adventure", "PG");	
		Movies movie3 = new Movies("Avengers: Age of Ultron", "Action", "15");
		Movies movie4 = new Movies("Spectre", "Action", "18");
		Movies movie5 = new Movies("Paranormal Activity", "Horror", "18");
		
		service.addMovies(1,movie1);	
		service.addMovies(2,movie2);
		service.addMovies(3,movie3);
		service.addMovies(4,movie4);
		service.addMovies(5, movie5);

		System.out.println(service.getMovies(1));
		System.out.println(service.getMovies(3));
		System.out.println(service.converter(3));
		
	}
	
	


}
