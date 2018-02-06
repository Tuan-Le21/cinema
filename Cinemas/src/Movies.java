
public class Movies {
	 
	 private String name;
	 private String genre;
	 private String ageRating;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getAgeRating() {
		return ageRating;
	}
	public void setAgeRating(String ageRating) {
		this.ageRating = ageRating;
	}
	public Movies(String name, String genre, String ageRating) {
		super();
		this.name = name;
		this.genre = genre;
		this.ageRating = ageRating;
	}
	@Override
	public String toString() {
		return "movies [" + name + ", " + genre + ", " + ageRating + "]";
	}
	 
	
		  
		 
 
}



	
		

