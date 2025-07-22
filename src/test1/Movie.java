package test1;

public class Movie {
	String title;
	String genre;
	int runtime;

	public Movie(String title, String genre, int runtime) {
		this.title = title;
		this.genre = genre;
		this.runtime = runtime;
	}

	public boolean isLongMovie() {
		if (runtime >= 120) {
			return true;
		} else {
			return false;
		}

	}

}
