package com.javaschool.finaltask.Repository;

import com.javaschool.finaltask.Entity.Seat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeatRepository extends JpaRepository<Seat, Integer> {
}