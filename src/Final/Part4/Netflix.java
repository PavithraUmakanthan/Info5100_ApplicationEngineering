package Final.Part4;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Netflix {

    ArrayList<Genre> genres;

    public Netflix() {
        this.genres = new ArrayList<>();
    }

    public void addGenre(Genre genre) {
        this.genres.add(genre);
    }

    public ArrayList<Genre> getGenres() {
        return genres;
    }

    public void setGenres(final ArrayList<Genre> genres) {
        this.genres = genres;
    }

}

