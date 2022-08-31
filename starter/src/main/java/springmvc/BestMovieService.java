package springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BestMovieService {

//    @Autowired
//    public void setMovie(Movie movie) {
//        this.movie = movie;
//    }

    @Autowired
    public BestMovieService(@Qualifier("titanicMovie") Movie movie) {

        this.movie = movie;
    }

    private static Movie movie;

    public static Movie getBestMovie() {
        return movie;
    }
}
