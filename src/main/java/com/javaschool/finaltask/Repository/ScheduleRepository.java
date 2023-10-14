package com.javaschool.finaltask.Repository;

import com.javaschool.finaltask.Entity.Schedule;
import com.javaschool.finaltask.Entity.Station;
import com.javaschool.finaltask.Entity.Train;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ScheduleRepository extends JpaRepository<Schedule, Integer> {
    @Override
    List<Schedule> findAll();
    //TODO
    //Check how to work with the hour
    List<Schedule> findAllByArrivalTime(int time);

    List<Schedule> findAllByIsDelete(boolean bool);

    List<Schedule> findAllByDepartureStation(Station DepartureStation);

    List<Schedule> findAllByOriginStation(Station OriginStation);
    List<Schedule> findAllByDepartureStationAndOriginStation(Station Destiny, Station Origin);

    //Maybe just need the id and not all the object?
    List<Schedule> findAllByTrainNumber(Train train);

    Schedule findById(int id);
    Schedule findByArrivalTimeAndOriginStationAndDepartureStation(int ArrivalTime,Station Origin, Station Destiny);



}