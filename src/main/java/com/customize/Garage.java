package com.customize;

import java.util.ArrayList;
import java.util.List;

public class Garage {

  List<Car> garage = new ArrayList<>();

  public Garage() {
    garage.add(new Car("Honda"));
  }

  public Car selectMake(String make) {
    for(Car car: garage) {
      if(car.getMake().equals(make)){
        return car;
      }
    }
    return null;
  }


}
