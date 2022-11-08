package hu.aestallon.seatbooking.repository;

import hu.aestallon.seatbooking.domain.screening.Movie;
import hu.aestallon.seatbooking.domain.screening.Screening;

import java.time.LocalDateTime;
import java.util.List;

public interface ScreeningRepository {

    List<Screening> findAll();
    Screening findById(int id);
    List<Screening> findByMovie(Movie movie);
    List<Screening> findInPeriod(LocalDateTime start, LocalDateTime end);



}
