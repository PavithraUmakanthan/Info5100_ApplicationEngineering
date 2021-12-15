package Final.Part4;

import java.util.Date;
import java.util.List;

public class Movie {
    String title;
    Date releaseDate;
    List<String> actors;
    String director;

    public Movie(String title, Date date,List<String> actors, String director){
        this.title = title;
        this.releaseDate = date;
        this.actors = actors;
        this.director = director;
    }
}
