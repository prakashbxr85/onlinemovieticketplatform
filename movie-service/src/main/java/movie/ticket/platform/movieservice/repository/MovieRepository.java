package movie.ticket.platform.movieservice.repository;

import movie.ticket.platform.movieservice.entity.Industry;
import movie.ticket.platform.movieservice.entity.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface MovieRepository extends MongoRepository<Movie, String> {
	List<Movie> findByMovieName(String movieName);
	List<Movie> findByGenre(String genre);
	List<Movie> findByIndustry(Industry industry);
}
