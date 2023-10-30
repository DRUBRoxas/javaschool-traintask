package com.javaschool.finaltask.Domain.Station;

import com.javaschool.finaltask.Domain.Train.Train;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity(name = "Station")
@Table(name = "station", schema = "finaltask")
public class Station {
    private Integer id;

    private String stationName;

    private Byte isDelete;

    private Set<Train> trains = new LinkedHashSet<>();

    @Id
    @Column(name = "stationId", nullable = false)
    public Integer getId() {
        return id;
    }

    @Column(name = "stationName", nullable = false, length = 70)
    public String getStationName() {
        return stationName;
    }

    @Column(name = "isDelete")
    public Byte getIsDelete() {
        return isDelete;
    }

    @ManyToMany
    @JoinTable(name = "station_train",
            joinColumns = @JoinColumn(name = "station_stationId"),
            inverseJoinColumns = @JoinColumn(name = "train_train_number"))
    public Set<Train> getTrains() {
        return trains;
    }

}