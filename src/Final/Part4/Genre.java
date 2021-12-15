package Final.Part4;

import java.util.ArrayList;

public class Genre{

    ArrayList<Movie> movies;

    public Genre(ArrayList<Movie> movies){
        this.movies = movies;
    }

    public void addMovie(Movie movie){
        this.movies.add(movie);
    }

    public ArrayList<Movie> getMovies() {
        return movies;
    }

    public void setMovies(final ArrayList<Movie> movies) {
        this.movies = movies;
    }


}



