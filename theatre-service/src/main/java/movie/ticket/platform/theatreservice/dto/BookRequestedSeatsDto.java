package movie.ticket.platform.theatreservice.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import movie.ticket.platform.theatreservice.entity.SeatType;
import movie.ticket.platform.theatreservice.entity.ShowTime;
import lombok.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Builder
public class BookRequestedSeatsDto implements Serializable {

    private static final long serialVersionUID=1L;
    private String theaterId;
    private String movieId;
    private Long screenId;
    private Long userId;
    private Integer numOfSeats;
    private List<Long> seatIds;
    private SeatType seatType;
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd/MM/yyyy")
    private Date date;
    private String bookingId;
    private ShowTime showTime;

}
