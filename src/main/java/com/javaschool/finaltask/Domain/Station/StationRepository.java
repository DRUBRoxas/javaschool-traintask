package com.javaschool.finaltask.Domain.Station;

import com.javaschool.finaltask.Domain.Train.Train;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StationRepository extends JpaRepository<Station, Integer> {
    @Override
    List<Station> findAll();

    List<Station> findAllById(int id);
    List <Station> findAllByStationName(String name);

    List <Station> findAllByIsDelete(boolean bool);

    List <Station> findAllByTrainsContains(Train train);

}