package hu.aestallon.seatbooking.domain;

import hu.aestallon.seatbooking.domain.theatre.Room;
import hu.aestallon.seatbooking.domain.theatre.Seat;

import java.time.LocalDateTime;

public class FreeSeat {
    private Room room;
    private LocalDateTime dateTime;
    private Seat seat;
}
