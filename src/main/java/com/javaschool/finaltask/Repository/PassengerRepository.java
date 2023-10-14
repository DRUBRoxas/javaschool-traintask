package com.javaschool.finaltask.Repository;

import com.javaschool.finaltask.Entity.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PassengerRepository extends JpaRepository<Passenger, String> {
    @Override
    List<Passenger> findAll();

    List<Passenger> findAllByUserEmail();

    List<Passenger> findAllByDateBirth_Year(int year);
}