package movie.ticket.platform.bookingservice.external.services;


import movie.ticket.platform.bookingservice.dto.BookRequestedSeatsDto;
import movie.ticket.platform.bookingservice.dto.BookedSeatsDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
@FeignClient(name = "THEATRE-SERVICE")
public interface TheatreService {

    @PostMapping("/api/theatres/s/checkRequestedSeatsAvailability")
    public ResponseEntity<Boolean> checkRequestedSeatsAvailability(@RequestBody BookRequestedSeatsDto bookRequestedSeatsDto);

    @PostMapping("/api/theatres/s/bookRequestedSeats")
    public ResponseEntity<BookedSeatsDto> bookRequestedSeats(@RequestBody BookRequestedSeatsDto bookRequestedSeatsDto);

    @PostMapping("/api/theatres/s/checkNSeatsAvailability")
    public ResponseEntity<Boolean> checkNSeatsAvailability(@RequestBody BookRequestedSeatsDto bookRequestedSeatsDto);

    @PostMapping("/api/theatres/s/bookNSeats")
    public ResponseEntity<BookedSeatsDto> bookNSeats(@RequestBody BookRequestedSeatsDto bookRequestedSeatsDto);
}
