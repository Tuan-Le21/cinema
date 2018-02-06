

public class Main {

	public static void main(String[] args) {
		Service service = new Service();
		Movies j = new Movies("Jumanji: Welcome to the jungle","Fantasy", "12a");
		Movies h = new Movies("Harry Potter and the order of the pheonix", "Adventure", "PG");	
		Movies a = new Movies("Avengers: Age of Ultron", "Action", "15");
		Movies b = new Movies("Spectre", "Action", "18");	
		
		service.addMovies(1,j);	
		service.addMovies(2, h);
		service.addMovies(3, a);
		service.addMovies(4, b);

		System.out.println(service.getMovies(1));
		System.out.println(service.getMovies(3));
		System.out.println(service.converter(3));
	}
	
	


}
