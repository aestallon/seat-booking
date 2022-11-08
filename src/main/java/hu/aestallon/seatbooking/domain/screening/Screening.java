package hu.aestallon.seatbooking.domain.screening;

import hu.aestallon.seatbooking.domain.theatre.Room;
import hu.aestallon.seatbooking.repository.FreeSeatRepository;
import hu.aestallon.seatbooking.repository.ScreeningRepository;

import java.time.LocalDateTime;

/**
 * Screening
 *     -----  -------  -----    -----
 *     id     movieId  roomId    time
 */
public class Screening {
    private int screeningId;
    private Movie movie;
    private Room room;
    private LocalDateTime dateTime;


    public Screening(int screeningId, Movie movie, Room room, LocalDateTime dateTime) {
        this.screeningId = screeningId;
        this.movie = movie;
        this.room = room;
        this.dateTime = dateTime;
    }

    public int getScreeningId() {
        return screeningId;
    }

    public Movie getMovie() {
        return movie;
    }

    public Room getRoom() {
        return room;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }
}
