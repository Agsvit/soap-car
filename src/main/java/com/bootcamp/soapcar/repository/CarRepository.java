package com.bootcamp.soapcar.repository;

import com.bootcamp.soapcar.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

    Car findByPlate(int plate);
}
