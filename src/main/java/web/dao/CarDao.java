package web.dao;

import web.object.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDao {
    private final List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car(1, "Gazelle", "B"));
        carList.add(new Car(2, "Scooter", "M"));
        carList.add(new Car(3, "Java", "A"));
        carList.add(new Car(4, "Trailer", "CE"));
        carList.add(new Car(5, "Icarus", "D"));
    }

    public List<Car> getAllCars() {
        return carList;
    }
}
