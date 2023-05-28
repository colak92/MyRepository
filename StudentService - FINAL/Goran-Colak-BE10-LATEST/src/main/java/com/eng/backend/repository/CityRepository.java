package com.eng.backend.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eng.backend.model.City;

@Repository
public interface CityRepository extends JpaRepository<City, Integer> {

}
