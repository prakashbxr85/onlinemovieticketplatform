package movie.ticket.platform.theatreservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import movie.ticket.platform.theatreservice.entity.Theatre;
import movie.ticket.platform.theatreservice.service.TheatreService;

import lombok.AllArgsConstructor;

import java.util.List;

@RestController
@RequestMapping("/api/theatres")
@AllArgsConstructor
@CrossOrigin(origins="*")
public class TheatreController {

    @Autowired
    @Lazy
	private TheatreService theatreService;

    @PostMapping
    public ResponseEntity<Theatre> saveTheatre(@RequestBody Theatre theatre){
        Theatre savedTheatre = theatreService.saveTheatre(theatre);
        return new ResponseEntity<>(savedTheatre, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<Theatre> getTheatreById(@PathVariable("id") String theatreId){
        Theatre theatre = theatreService.getTheatreById(theatreId);
        return ResponseEntity.ok(theatre);
    }
    @GetMapping("/t/{theatreName}")
    public ResponseEntity<List<Theatre>> getTheatreByTheatreName(@PathVariable("theatreName") String theatreName){
        List<Theatre> theatre = theatreService.getTheatreByTheatreName(theatreName);
        return ResponseEntity.ok(theatre);
    }
}

