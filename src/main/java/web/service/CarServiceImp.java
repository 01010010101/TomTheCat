package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarDaoImp;
import web.object.Car;

import java.util.List;

@Service
public class CarServiceImp implements CarService {

CarDaoImp carDao = new CarDaoImp();

    public List<Car> getLimitCars(Integer count) {
        return carDao.getAllCars().stream().limit(count).toList();
    }
    public List<Car> getAllCars() {
       return carDao.getAllCars();

    }
}