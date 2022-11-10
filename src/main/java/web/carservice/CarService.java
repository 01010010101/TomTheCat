package web.carservice;

import org.springframework.stereotype.Service;
import web.object.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    private final List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car(1, "Gazelle", "B"));
        carList.add(new Car(2, "Scooter", "M"));
        carList.add(new Car(3, "Java", "A"));
        carList.add(new Car(4, "Trailer", "CE"));
        carList.add(new Car(5, "Icarus", "D"));
    }

    public List<Car> getLimitCars(Integer count) {
        return carList.stream().limit(count).toList();
    }
    public List<Car> getAllCars() {
        return carList;
    }
}