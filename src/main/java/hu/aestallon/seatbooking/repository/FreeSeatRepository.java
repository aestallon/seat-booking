package hu.aestallon.seatbooking.repository;

import hu.aestallon.seatbooking.domain.theatre.Room;
import hu.aestallon.seatbooking.domain.theatre.Seat;

import java.time.LocalDateTime;
import java.util.List;

public interface FreeSeatRepository {

    List<Seat> findFreeSeats(Room room, LocalDateTime startTime);
}
