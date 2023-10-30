package com.javaschool.finaltask.Domain.Train;

import com.javaschool.finaltask.Domain.Station.Station;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity(name = "Train")
@Table(name = "train", schema = "finaltask", indexes = {
        @Index(name = "traincol_UNIQUE", columnList = "traincol", unique = true)
})
public class Train {
    private Integer id;

    private Short seats;

    private Byte isDelete;

    private String traincol;

    private Set<Station> stations = new LinkedHashSet<>();

    @Id
    @Column(name = "train_number", nullable = false)
    public Integer getId() {
        return id;
    }

    @Column(name = "seats")
    public Short getSeats() {
        return seats;
    }

    @Column(name = "isDelete")
    public Byte getIsDelete() {
        return isDelete;
    }

    @Column(name = "traincol", length = 45)
    public String getTraincol() {
        return traincol;
    }

    @ManyToMany(mappedBy = "trains")
    public Set<Station> getStations() {
        return stations;
    }

}