package com.javaschool.finaltask.Domain.Schedule;

import com.javaschool.finaltask.Domain.Station.Station;
import com.javaschool.finaltask.Domain.Train.Train;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
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