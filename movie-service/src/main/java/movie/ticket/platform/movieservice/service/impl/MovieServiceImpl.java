package movie.ticket.platform.movieservice.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import movie.ticket.platform.movieservice.entity.Industry;
import movie.ticket.platform.movieservice.entity.Movie;
import movie.ticket.platform.movieservice.repository.MovieRepository;
import movie.ticket.platform.movieservice.service.MovieService;
import movie.ticket.platform.movieservice.exception.InvalidParameterException;
import movie.ticket.platform.movieservice.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor

public class MovieServiceImpl implements MovieService {

    private MovieRepository movieRepository;

    @Override
    public Movie saveMovie(Movie movie) {
        try {
            //Generate unique movieId
            String uniqueMovieId = UUID.randomUUID().toString();
            movie.setMovieId(uniqueMovieId);
            return movieRepository.save(movie);
        } catch (Exception e) {
            throw new InvalidParameterException("Failed to add movie. " + e.getMessage());
        }
    }


    @Override
    public Movie getMovieById(String movieId) {
        try {
            Optional<Movie> optionalMovie = movieRepository.findById(movieId);
            return optionalMovie.get();
        } catch (Exception e) {
            throw new ResourceNotFoundException("Unable to find movie with given ID. " + e.getMessage());
        }
    }

    @Override
    public List<Movie> getMovieByName(String movieName) {
        try {
            return movieRepository.findByMovieName(movieName);
        } catch (Exception e) {
            throw new ResourceNotFoundException("Unable to find movie with given name. " + e.getMessage());
        }
    }

    @Override
    public List<Movie> getByGenre(String genre) {
        try {
            return movieRepository.findByGenre(genre);
        } catch (Exception e) {
            throw new ResourceNotFoundException("Unable to find movie with given genre. " + e.getMessage());
        }
    }

    @Override
    public List<Movie> getByIndustry(Industry industry) {
        try {
            return movieRepository.findByIndustry(industry);
        } catch (Exception e) {
            throw new ResourceNotFoundException("Unable to find movie with given industry. " + e.getMessage());
        }
    }
}
