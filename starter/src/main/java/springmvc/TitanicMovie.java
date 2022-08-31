package springmvc;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@Qualifier("titanicMovie")
public class TitanicMovie implements Movie {


    public String getTitle() {
        return "Titanic";
    }


    public String getMaturityRating() {
        return "PG-13";
    }


    public String getGenre() {
        return "Romance";
    }
}
