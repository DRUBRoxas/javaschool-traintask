package com.javaschool.finaltask.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;

@Getter
@Setter
@Entity(name = "Schedule")
@Table(name = "schedule", schema = "finaltask", indexes = {
        @Index(name = "fk_Schedule_Station1_idx", columnList = "departureStation"),
        @Index(name = "fk_Schedule_Station2_idx", columnList = "originStation"),
        @Index(name = "fk_Schedule_Train1_idx", columnList = "train_Number")
})
public class Schedule {
    private Integer id;

    private LocalTime departureTime;

    private LocalTime arrivalTime;

    private Station departureStation;

    private Station originStation;

    private Train trainNumber;

    private Byte isDelete;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idSchedule", nullable = false)
    public Integer getId() {
        return id;
    }

    @Column(name = "departureTime", nullable = false)
    public LocalTime getDepartureTime() {
        return departureTime;
    }

    @Column(name = "arrival_time", nullable = false)
    public LocalTime getArrivalTime() {
        return arrivalTime;
    }

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "departureStation", nullable = false)
    public Station getDepartureStation() {
        return departureStation;
    }

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "originStation", nullable = false)
    public Station getOriginStation() {
        return originStation;
    }

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "train_Number", nullable = false)
    public Train getTrainNumber() {
        return trainNumber;
    }

    @Column(name = "isDelete")
    public Byte getIsDelete() {
        return isDelete;
    }

}