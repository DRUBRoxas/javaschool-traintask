package com.javaschool.finaltask.Repository;

import com.javaschool.finaltask.Entity.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<Passenger, String> {
}