package com.customize.controllers;

import com.customize.Car;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GarageController {

  @GetMapping("/selectMake")
  private Car selectCarMake(){
    Car car = new Car();
    return car.selectMake();
  }

}
