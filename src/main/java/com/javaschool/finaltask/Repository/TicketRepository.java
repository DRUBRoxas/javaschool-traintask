package com.javaschool.finaltask.Repository;

import com.javaschool.finaltask.Entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TicketRepository extends JpaRepository<Ticket, Integer> {
    @Override
    List<Ticket> findAll();

    List<Ticket> findAllByPassengerUserEmail(String email);
    List<Ticket> findAllByScheduleIdschedule(int id);
}