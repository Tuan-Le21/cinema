import java.util.HashMap;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Service {
	HashMap<Integer, Movies> moviesMap = new HashMap<Integer, Movies>();

	public Movies createMovie(String name, String genre, String ageRating) {
		Movies movie = new Movies(name, genre, ageRating);
		return movie;
	}

	public void generateMap() {

		addMovies(1, createMovie("Jumanji: Welcome to the jungle", "Fantasy", "12a"));
		addMovies(2, createMovie("Harry Potter and the order of the pheonix", "Adventure", "PG"));
		addMovies(3, createMovie("Avengers: Age of Ultron", "Action", "15"));
		addMovies(4, createMovie("Spectre", "Action", "18"));
		addMovies(5, createMovie("Paranormal Activity", "Horror", "18"));

	}

	public void addMovies(Integer x, Movies m) {
		moviesMap.put(x, m);
	}

	public Movies getMovies(Integer x) {
		return moviesMap.get(x);
	}

	public String converter(int Y) {

		String json = null;
		try {
			json = new ObjectMapper().writeValueAsString(moviesMap.get(Y));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return json;
	}
	public int countGenre(String genre) {

		int count = 0;
		for (int i = 1; i <= moviesMap.size(); i++) {
			if (moviesMap.get(i).getGenre().equalsIgnoreCase(genre)) {
				count++;
			}
		}
		return count;

	}



}
