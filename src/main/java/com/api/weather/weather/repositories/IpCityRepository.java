package com.api.weather.weather.repositories;

import com.api.weather.weather.models.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface IpCityRepository extends CrudRepository<City, Integer> {

}
