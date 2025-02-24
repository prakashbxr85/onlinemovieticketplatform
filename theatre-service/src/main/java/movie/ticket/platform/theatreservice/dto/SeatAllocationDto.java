package movie.ticket.platform.theatreservice.dto;

import movie.ticket.platform.theatreservice.entity.Seat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class SeatAllocationDto {

    private String movieId;
    private String theatreId;
    private Long screenId;
    private Date fromDate;
    private Date toDate;
    private Set<Seat> seats;

}
