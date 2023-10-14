package com.javaschool.finaltask.Repository;

import com.javaschool.finaltask.Entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Integer> {
}