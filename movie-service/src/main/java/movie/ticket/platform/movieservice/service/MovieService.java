package movie.ticket.platform.movieservice.service;

import movie.ticket.platform.movieservice.entity.Industry;
import movie.ticket.platform.movieservice.entity.Movie;

import java.util.List;

public interface MovieService {
    Movie saveMovie(Movie movie);
    Movie getMovieById(String movieId);
    List<Movie> getMovieByName(String movieName);
    List<Movie> getByGenre(String genre);
    List<Movie> getByIndustry(Industry industry);
}