package web.carservice;

import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.object.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

CarDao carDao = new CarDao();

    public List<Car> getLimitCars(Integer count) {
        return carDao.getAllCars().stream().limit(count).toList();
    }
    public List<Car> getAllCars() {
       return carDao.getAllCars();

    }
}