package com.customize;

import org.springframework.stereotype.Component;

@Component
public class Garage {

  private Car car;

  public Car defaultMake(String make) {
    car = new Car(make);
    return car;
  }
}
