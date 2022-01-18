package web.service;

import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {

    @Override
    public List<Car> carList(Integer count) {
        List<Car> carList; {
            carList = new ArrayList<>();
            carList.add(new Car("Lada", "Priora", 2012));
            carList.add(new Car("Chevrolet", "Impala", 1967));
            carList.add(new Car("Toyota", "Land Cruiser 300", 2022));
            carList.add(new Car("BMW", "X3", 2019));
            carList.add(new Car("Audi", "Q6", 2023));
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}