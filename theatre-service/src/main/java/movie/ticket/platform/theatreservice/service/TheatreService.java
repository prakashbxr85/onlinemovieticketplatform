package movie.ticket.platform.theatreservice.service;

import movie.ticket.platform.theatreservice.entity.Theatre;

import java.util.List;

public interface TheatreService {
    Theatre saveTheatre(Theatre theatre);
    List<Theatre> getTheatreByTheatreName(String theatreName);
    Theatre getTheatreById(String theatreId);
    List<Theatre> getTheatresByCityAndMidDayShow(String city);
    List<Theatre> getTheatresByCityAndEveShow(String city);
    List<Theatre> getTheatresByCityAndNightShow(String city);
    List<Theatre> getTheatresByCity(String city);
    List<Theatre> getAllById(List<String> theatreIds);
}