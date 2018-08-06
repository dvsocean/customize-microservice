package com.customize;

import java.util.HashMap;
import org.springframework.stereotype.Component;

@Component
public class Garage {

  private HashMap<String, Cars> garageList = new HashMap<>();

  public Garage() {
   garageList.put("Ferarri", new Cars("Ferarri", "Modena", "Yellow", "v12", "8 liters", "ShiftTronic", "Black and yellow"));
   garageList.put("Honda", new Cars("Honda", "Accord", "Silver", "i4", "1.5 liters", "Automatic", "Black on black"));
   garageList.put("Lamborgini", new Cars("Lamborgini", "Reventon", "Black", "v12", "12 liters", "TouchTronic", "Black on gray"));
  }

  public Cars selectModel(String model) {
    for(Cars car: garageList.values()) {
      if(car.getModel().equalsIgnoreCase(model)){
        return car;
      }
    }
    return null;
  }

  public Cars selectMake(String make) {
    for(Cars car: garageList.values()) {
      if(car.getMake().equalsIgnoreCase(make)){
        return car;
      }
    }
    return null;
  }

  public Cars selectColor(String color) {
    for(Cars car: garageList.values()) {
      if(car.getColor().equalsIgnoreCase(color)){
        return car;
      }
    }
    return null;
  }

  public Cars selectEngine(String engine) {
    for(Cars car: garageList.values()) {
      if(car.getEngine().equalsIgnoreCase(engine)){
        return car;
      }
    }
    return null;
  }

  public Cars selectEngineSize(String engineSize) {
    for(Cars car: garageList.values()) {
      if(car.getEngineSize().equalsIgnoreCase(engineSize)){
        return car;
      }
    }
    return null;
  }

  public Cars selectTransmission(String transmission) {
    for(Cars car: garageList.values()) {
      if(car.getTransmission().equalsIgnoreCase(transmission)){
        return car;
      }
    }
    return null;
  }

  public Cars selectInterior(String interior) {
    for(Cars car: garageList.values()) {
      if(interior.isEmpty()){
        car.setInterior("Black");
        return car;
      }
      if(car.getInterior().equalsIgnoreCase(interior)){
        return car;
      }
    }
    return null;
  }


}//End of class
