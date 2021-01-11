package collectdemo;
import java.util.*;
import java.util.Collections;

class Movie implements Comparable<Movie>
{
	private String movieName;
	private int relyear;
	public Movie(String movieName,int relyear) {
		this.movieName= movieName;
		this.relyear = relyear;
	}
	public String getMovieName() {
		return movieName;
	}
	public int getrelyear() {
		return relyear;
	}
	public int compareTo(Movie o) {
		return this.relyear-o.relyear;
	}
	
}

public class colldemo {

	public static void main(String[] args) {
		List<Movie> mv =new ArrayList<Movie>();
		mv.add(new Movie("M17",2022));
		mv.add(new Movie("Andhadhun",2019));
		mv.add(new Movie("War",2018));

        Collections.sort(mv);
        for(Movie m:mv)
        {
        	System.out.println(m.getMovieName() + " "+m.getrelyear());
        }
	}

}
