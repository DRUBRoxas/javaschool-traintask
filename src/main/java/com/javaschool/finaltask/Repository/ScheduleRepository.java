package com.javaschool.finaltask.Repository;

import com.javaschool.finaltask.Entity.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScheduleRepository extends JpaRepository<Schedule, Integer> {
}