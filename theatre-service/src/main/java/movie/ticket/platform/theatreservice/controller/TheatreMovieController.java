package movie.ticket.platform.theatreservice.controller;

import movie.ticket.platform.theatreservice.dto.BrowseTheatreDto;
import movie.ticket.platform.theatreservice.dto.TheatreMovieDto;
import movie.ticket.platform.theatreservice.entity.Theatre;
import movie.ticket.platform.theatreservice.service.TheatreMovieService;
import movie.ticket.platform.theatreservice.service.TheatreService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/theatres")
@AllArgsConstructor
@CrossOrigin(origins="*")
public class TheatreMovieController {
    @Autowired
	private TheatreMovieService theatreMovieService;
    @Autowired
    @Lazy
    private TheatreService theatreService;

    @PostMapping("allotMovie")
    public ResponseEntity<Boolean> allotMovieToTheatre(@RequestBody TheatreMovieDto theatreMovieDto){
        Boolean status = theatreMovieService.saveTheatreMovie(theatreMovieDto);
        return new ResponseEntity<>(status, HttpStatus.CREATED);
    }
    @GetMapping("/t/browse")
    public ResponseEntity<List<Theatre>> browseTheatre(@RequestBody BrowseTheatreDto browseTheatreDto){
        List<Theatre> theatre = theatreMovieService.getTheatreByMovieCityShowDateAndTime(browseTheatreDto.getMovieId(),
                browseTheatreDto.getCity(),
                browseTheatreDto.getDate(),
                browseTheatreDto.getShowTime());
        return ResponseEntity.ok(theatre);
    }
}

