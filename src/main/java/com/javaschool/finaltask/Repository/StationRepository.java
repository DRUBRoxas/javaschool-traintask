package com.javaschool.finaltask.Repository;

import com.javaschool.finaltask.Entity.Station;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StationRepository extends JpaRepository<Station, Integer> {
}