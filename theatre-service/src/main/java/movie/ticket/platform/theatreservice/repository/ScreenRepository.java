package movie.ticket.platform.theatreservice.repository;

import movie.ticket.platform.theatreservice.entity.Screen;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ScreenRepository extends JpaRepository<Screen, Long> {
    List<Screen> findByScreenName(String screenName);
    List<Screen> findAllByTheatre(String theatreId);
}
