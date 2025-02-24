package movie.ticket.platform.bookingservice.service;


import movie.ticket.platform.bookingservice.dto.BookRequestedSeatsDto;
import movie.ticket.platform.bookingservice.dto.BookedSeatsDto;

public interface BookingService {
    /*List<Booking> getByUserId(Long userId);
    List<Booking> getByUserIdAndMovieId(Long userId, String movieId);
    List<Booking> getByUserIdAndMovieIdAndDate(Long userId, String movieId, Date date);
    List<Booking> getByTheaterIdAndMovieId(String theaterId, String movieId);
    List<Booking> getByTheaterIdAndMovieIdAndDate(String theaterId, String movieId, Date date);
    List<Booking> getByTheaterIdAndMovieIdAndDateAndShowTime(String theaterId, String movieId, Date date, ShowTime showTime);*/
    Boolean checkRequestedSeatsAvailability(BookRequestedSeatsDto bookRequestedSeatsDto);
    Boolean checkNSeatsAvailability(BookRequestedSeatsDto bookRequestedSeatsDto);
    BookedSeatsDto bookRequestedSeats(BookRequestedSeatsDto bookRequestedSeatsDto);
    BookedSeatsDto bookNSeats(BookRequestedSeatsDto bookRequestedSeatsDto);
}