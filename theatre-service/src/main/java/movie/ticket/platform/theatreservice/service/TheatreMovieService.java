package movie.ticket.platform.theatreservice.service;

import movie.ticket.platform.theatreservice.dto.TheatreMovieDto;
import movie.ticket.platform.theatreservice.entity.ShowTime;
import movie.ticket.platform.theatreservice.entity.Theatre;

import java.util.Date;
import java.util.List;

public interface TheatreMovieService {
    Boolean saveTheatreMovie(TheatreMovieDto theatreMovieDto);
    Boolean checkTheatreScreenAvailability(String theatreId, Long screenId, Date fromDate, Date toDate);
    List<String> findTheatreRunningMovie(List<String> theatreIds, String movieId, Date date);
    List<Theatre> getTheatreByMovieCityShowDateAndTime(String movieId, String city, Date date, ShowTime showTime);
}