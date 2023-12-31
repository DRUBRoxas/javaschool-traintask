package com.javaschool.finaltask.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "Seat")
@Table(name = "seats", schema = "finaltask", indexes = {
        @Index(name = "fk_seats_train1_idx", columnList = "train_train_number")
})
public class Seat {
    private Integer id;

    private Byte isSeatFree;

    private Integer seatNumber;

    private Train trainTrainNumber;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idseat", nullable = false)
    public Integer getId() {
        return id;
    }

    @Column(name = "is_seat_free", nullable = false)
    public Byte getIsSeatFree() {
        return isSeatFree;
    }

    @Column(name = "seat_number")
    public Integer getSeatNumber() {
        return seatNumber;
    }

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "train_train_number", nullable = false)
    public Train getTrainTrainNumber() {
        return trainTrainNumber;
    }

}