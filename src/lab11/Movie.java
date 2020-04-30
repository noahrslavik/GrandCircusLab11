package lab11;

public class Movie {
	
	public Object Movie;
	private String title;
	private String category;
	
	public Movie(String title, String category) {
		this.title = title;
		this.category = category;
	}
	
	
	
	private void setTitle(String title) {
		this.title = title;
	}
	private void set(String category) {
		this.category = category;
	}
	//getter
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public String toString() {
		return ("Title: " + getTitle() + "\nCatergory: " + getCategory());
	}
	
	
}
