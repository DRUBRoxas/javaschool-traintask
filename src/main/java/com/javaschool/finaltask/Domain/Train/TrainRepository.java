package com.javaschool.finaltask.Domain.Train;
import com.javaschool.finaltask.Domain.Station.Station;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TrainRepository extends JpaRepository<Train, Integer> {
    Train findTrainById(int id);

    List<Train> findAllByStations(Station Station);
}