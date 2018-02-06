import java.util.HashMap;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Service {
	HashMap<Integer, Movies> moviesMap = new HashMap<Integer, Movies>();
	
	public void addMovies(Integer x, Movies m) {
		moviesMap.put(x,m);
	}
	
	public  Movies getMovies(Integer x) {
		return moviesMap.get(x);
	}
	public String converter() {
		
		String json = null;
		try {
			json = new ObjectMapper().writeValueAsString(moviesMap);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return json;
	}
	
}
	

