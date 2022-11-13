package web.service;

import web.object.Car;

import java.util.List;

public interface CarService {
    List<Car> getLimitCars(Integer count);
    List<Car> getAllCars();
}
