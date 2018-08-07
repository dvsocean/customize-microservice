package com.customize;

import java.util.ArrayList;
import java.util.List;

public class Garage {

  private List<Car> garage = new ArrayList<>();

  public Garage() {
    garage.add(new Car("Honda", "Accord", "Silver", "i4"));
    garage.add(new Car("Acura", "Integra", "Black", "i4"));
    garage.add(new Car("Chevy", "Camaro", "Yellow", "v8"));
  }

  public Car selectMake(String make) throws NoMakeSelectedError {
    if(make.isEmpty()){
      throw new NoMakeSelectedError();
    } else {
      for(Car car: garage) {
        if(car.getMake().equals(make)){
          return car;
        }
      }
    }
    return null;
  }


  public Car selectModel(String model) throws NoModelSelectedError {
    if(model.isEmpty()){
      throw new NoModelSelectedError();
    } else {
      for(Car car: garage) {
        if(car.getModel().equalsIgnoreCase(model)){
          return car;
        }
      }
    }
     return null;
  }

  public Car selectColor(String color) {
    if(color.isEmpty()){
      for(Car car: garage) {
        if(car.getColor().equalsIgnoreCase("black")){
          return car;
        }
      }
    } else {
      for(Car car: garage) {
        if(car.getColor().equalsIgnoreCase(color)){
          return car;
        }
      }
    }
    return null;
  }

  public Car selectEngine(String engine) throws NoEngineSelectedError {
    if(engine.isEmpty()){
      throw new NoEngineSelectedError();
    } else {
      for(Car car: garage) {
        if(car.getEngine().equalsIgnoreCase(engine)){
          return car;
        }
      }
    }
    return null;
  }



}//End of class
