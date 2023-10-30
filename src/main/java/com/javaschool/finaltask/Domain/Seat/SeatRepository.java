package com.javaschool.finaltask.Domain.Seat;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SeatRepository extends JpaRepository<Seat, Integer> {
    List<Seat>  findAllByTrainNumber(int trainId);
    List<Seat> findAllByIsSeatFree(boolean bool);
}