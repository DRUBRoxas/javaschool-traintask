package com.javaschool.finaltask.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "Ticket")
@Table(name = "ticket", schema = "finaltask", indexes = {
        @Index(name = "fk_ticket_seats1_idx", columnList = "seats_idseat"),
        @Index(name = "fk_ticket_schedule1_idx", columnList = "schedule_idSchedule"),
        @Index(name = "fk_ticket_passenger1_idx", columnList = "passenger_user_email")
})
public class Ticket {
    private Integer id;

    private Seat seatsIdseat;

    private Byte isDelete;

    private Schedule scheduleIdschedule;

    private Passenger passengerUserEmail;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTicket", nullable = false)
    public Integer getId() {
        return id;
    }

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "seats_idseat", nullable = false)
    public Seat getSeatsIdseat() {
        return seatsIdseat;
    }

    @Column(name = "isDelete")
    public Byte getIsDelete() {
        return isDelete;
    }

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "schedule_idSchedule", nullable = false)
    public Schedule getScheduleIdschedule() {
        return scheduleIdschedule;
    }

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "passenger_user_email", nullable = false)
    public Passenger getPassengerUserEmail() {
        return passengerUserEmail;
    }

}