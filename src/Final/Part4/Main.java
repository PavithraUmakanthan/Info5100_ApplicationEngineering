package Final.Part4;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws ParseException {
        ArrayList<Movie> marvelMovies = new ArrayList<>();
        ArrayList<Movie> dcMovies = new ArrayList<>();
        ArrayList<Genre> genres = new ArrayList<>();

        Date twoThousand = new GregorianCalendar(2000, Calendar.JANUARY, 1).getTime();
        Date nineteenHundred = new GregorianCalendar(1990, Calendar.JANUARY, 1).getTime();
        Movie a = new Movie("Spiderman", new GregorianCalendar(2003, Calendar.FEBRUARY, 15).getTime(),
                Arrays.asList("Zendaya", "TomHolland"), "Tom");
        Movie b = new Movie("Avengers", new GregorianCalendar(1987, Calendar.AUGUST, 03).getTime(),
                Arrays.asList("Chris", "Nick"), "Marvel");
        Movie c = new Movie("Batman", new GregorianCalendar(2020, Calendar.DECEMBER, 01).getTime(),
                Arrays.asList("John", "Matt"), "John");
        Movie d = new Movie("Superman", new GregorianCalendar(1997, Calendar.JUNE, 24).getTime(),
                Arrays.asList("Superman", "Supergirl"), "Chris");

        marvelMovies.add(a);
        marvelMovies.add(b);
        dcMovies.add(c);
        dcMovies.add(d);

        Genre marvelGenre = new Genre(marvelMovies);
        Genre dcGenre = new Genre(dcMovies);

        genres.add(marvelGenre);
        genres.add(dcGenre);

        Netflix netflix = new Netflix();
        netflix.setGenres(genres);

        /**For all movies released before 2000, add the string "(Classic)" to the title of the movie using
         flatMap.
         **/
        netflix.genres.stream()
                .flatMap(genre -> genre.movies.stream())
                .filter(movie -> movie.releaseDate.before(twoThousand))
                .forEach(movie -> movie.title = movie.title + "(Classic)");

        List<Movie> ans = netflix.genres.stream().flatMap(genre -> genre.movies.stream()).sorted(new Comparator<Movie>() {
            @Override
            public int compare(Movie mov1, Movie mov2) {
                return mov2.releaseDate.compareTo(mov1.releaseDate);
            }
        }).limit(3).collect(Collectors.toList());

        /**Create a predicate for release date before 2000 and a predicate for release date before 1990
         and then Chain the predicates for finding movies between 1990 and 2000.**/

        List<Movie> listOfAllMovie = netflix.genres.stream().flatMap(genre -> genre.movies.stream()).collect(Collectors.toList());
        Predicate<Movie> moviesBefore2000 = movie -> movie.releaseDate.before(twoThousand);
        Predicate<Movie> moviesAfter1990 = movie -> movie.releaseDate.after(nineteenHundred);
        moviesInRange((ArrayList<Movie>) listOfAllMovie, moviesBefore2000, moviesAfter1990);

        /**Write a method which that will add release year in the title of the movie and return the title and
         then use this method for all the movies.**/
        for(Movie movie : listOfAllMovie) insertReleaseYear(movie);

        /*Sorting on one of the feature(Ex: Released year or title) which will use comparator.*/
        Collections.sort(listOfAllMovie, new Comparator<Movie>() {
            @Override
            public int compare(Movie mov1, Movie mov2) {
                return mov1.title.compareTo(mov2.title);
            }
        });
    }
    private static void insertReleaseYear(Movie movie) {
        SimpleDateFormat dayFormat = new SimpleDateFormat("yyyy");
        String year = dayFormat.format(movie.releaseDate);
        movie.title = movie.title + year;
    }
    private static void moviesInRange(ArrayList<Movie> result, Predicate<Movie> condition1, Predicate<Movie> condition2){
        for (Movie movie: result) {
            if(condition1.test(movie) && condition2.test(movie)){
                System.out.println(movie.title);
            }
        }
    }
}