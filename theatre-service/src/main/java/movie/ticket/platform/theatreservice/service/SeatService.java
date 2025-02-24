package movie.ticket.platform.theatreservice.service;

import movie.ticket.platform.theatreservice.entity.Seat;

import java.util.List;

public interface SeatService {
    Seat saveSeat(Seat seat);
    List<Seat> saveSeats(List<Seat> seats);
    List<Seat> getSeatByScreenId(Long screenId);
    Seat getSeatById(Long seatId);
}