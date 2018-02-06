import java.util.HashMap;

public class service {
	 HashMap<Integer, movies> moviesmap = new HashMap<Integer, movies>();
	
	public void addMovies(Integer x, movies m) {
		moviesmap.put(x,m);
	}
	
	public  movies getMovies(Integer x) {
		return moviesmap.get(x);
	}
	
	
}
	

