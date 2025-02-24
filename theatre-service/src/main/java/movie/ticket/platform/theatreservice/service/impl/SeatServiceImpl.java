package movie.ticket.platform.theatreservice.service.impl;

import movie.ticket.platform.theatreservice.repository.SeatRepository;
import movie.ticket.platform.theatreservice.entity.Seat;
import movie.ticket.platform.theatreservice.service.SeatService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SeatServiceImpl implements SeatService{
	@Autowired
	private SeatRepository seatRepository;
	@Override
	public Seat saveSeat(Seat seat) {
		return seatRepository.save(seat);
	}

	@Override
	public List<Seat> saveSeats(List<Seat> seats) {
		return seatRepository.saveAll(seats);
	}

	@Override
	public Seat getSeatById(Long seatId) {
		 return seatRepository.findById(seatId).get();
	}
	@Override
	public List<Seat> getSeatByScreenId(Long screenId) {
		 return seatRepository.findAllByScreen(screenId);
	}
}
