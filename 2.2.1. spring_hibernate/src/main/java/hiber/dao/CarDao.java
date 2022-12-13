package hiber.dao;

import hiber.model.Car;
import hiber.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface CarDao {
    void add(Car car);
    List<Car> listCars();
    User getOwner(String model, int series);
}
