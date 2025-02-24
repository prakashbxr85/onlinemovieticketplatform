package movie.ticket.platform.theatreservice.repository;

import movie.ticket.platform.theatreservice.entity.Seat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SeatRepository extends JpaRepository<Seat, Long> {
    List<Seat> findAllByScreen(Long screenId);
}
