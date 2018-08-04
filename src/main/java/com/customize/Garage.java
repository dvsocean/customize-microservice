package com.customize;

import java.util.HashMap;
import org.springframework.stereotype.Component;

@Component
public class Garage {

  private HashMap<String, Cars> garageList = new HashMap<>();

  public Garage() {
   garageList.put("Ferarri", new Cars("Ferarri", "Modena", "Yello", "v12", "8 liters", "ShiftTronic"));
   garageList.put("Honda", new Cars("Honda", "Accord", "Silver", "i4", "1.5 liters", "Automatic"));
   garageList.put("Lamborgini", new Cars("Lamborgini", "Reventon", "Black", "v12", "12 liters", "TouchTronic"));
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
}//End of class
