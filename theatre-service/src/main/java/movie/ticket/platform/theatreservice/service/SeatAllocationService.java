package movie.ticket.platform.theatreservice.service;

import movie.ticket.platform.theatreservice.dto.BookRequestedSeatsDto;
import movie.ticket.platform.theatreservice.dto.BookedSeatsDto;
import movie.ticket.platform.theatreservice.dto.SeatAllocationDto;

public interface SeatAllocationService {
    Boolean allotMovieSeat(SeatAllocationDto seatAllocationDto);
    Boolean checkRequestedSeatsAvailability(BookRequestedSeatsDto bookRequestedSeatsDto);
    Boolean checkNSeatsAvailability(BookRequestedSeatsDto bookRequestedSeatsDto);
    BookedSeatsDto bookRequestedSeats(BookRequestedSeatsDto bookRequestedSeatsDto);
    BookedSeatsDto bookNSeats(BookRequestedSeatsDto bookRequestedSeatsDto);
}