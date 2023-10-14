package com.javaschool.finaltask.Repository;
import com.javaschool.finaltask.Entity.Station;
import com.javaschool.finaltask.Entity.Train;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TrainRepository extends JpaRepository<Train, Integer> {
    Train findTrainById(int id);

    List<Train> findAllByStations(Station Station);
}