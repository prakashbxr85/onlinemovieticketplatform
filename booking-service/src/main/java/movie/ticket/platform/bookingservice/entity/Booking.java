package movie.ticket.platform.bookingservice.entity;

import movie.ticket.platform.bookingservice.dto.ShowTime;
import movie.ticket.platform.bookingservice.external.entity.SeatType;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "Booking")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class Booking {

    @Id
    private String bookingId;
    private Date date;
    private Long userId;
    private String movieId;
    private String theaterId;
    private ShowTime showTime;
    private SeatType seatType;
    private Long price;
    private Long discount;
    private BookingStatus bookingStatus;
    private Boolean isActive;

}
