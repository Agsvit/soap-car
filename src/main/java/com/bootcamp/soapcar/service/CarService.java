package com.bootcamp.soapcar.service;

import com.bootcamp.soapcar.model.Car;
import com.bootcamp.soapcar.repository.CarRepository;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Service
public class CarService {

    private final CarRepository carRepository;

    private static final Map<Integer, Car> cars = new HashMap<>();

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

  /*  @PostConstruct
    public void initialize() {
        Car car1 = new Car();
        car1.setPlate(1);
        car1.setModel("Opel Corsa");
        car1.setKms(10000);

        Car car2 = new Car();
        car2.setPlate(2);
        car2.setModel("Renault Clio");
        car2.setKms(25000);

        Car car3 = new Car();
        car3.setPlate(3);
        car3.setModel("Hyundai i20");
        car3.setKms(16500);

        cars.put(car1.getPlate(), car1);
        cars.put(car2.getPlate(), car2);
        cars.put(car3.getPlate(), car3);
    }

    public Car getCars(int plate) {
        return cars.get(plate);
    }
*/
    public Car findCarByName(int plate) {
        return carRepository.findByPlate(plate);
    }
}
