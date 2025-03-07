package movie.ticket.platform.theatreservice.service.impl;

import movie.ticket.platform.theatreservice.repository.ScreenRepository;
import movie.ticket.platform.theatreservice.entity.Screen;
import movie.ticket.platform.theatreservice.service.ScreenService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ScreenServiceImpl implements ScreenService{
	
	 private ScreenRepository screenRepository;
	@Override
	public Screen saveScreen(Screen screen) {
		return screenRepository.save(screen);
	}

	@Override
	public List<Screen> saveScreens(List<Screen> screens) {
		return screenRepository.saveAll(screens);
	}

	@Override
	public Screen getScreenById(Long screenId) {
		 return screenRepository.findById(screenId).get();
	}
	@Override
	public List<Screen> getScreenByScreenName(String screenName) {
		 return screenRepository.findByScreenName(screenName);
	}

	@Override
	public List<Screen> getScreenByTheatreId(String theatreId) {
		return screenRepository.findAllByTheatre(theatreId);
	}
}
