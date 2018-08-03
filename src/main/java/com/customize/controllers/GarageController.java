package com.customize.controllers;

import com.customize.Car;
import com.customize.Garage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GarageController {

  @Autowired
  private Garage garage;

  @GetMapping("/selectMake/{make}")
  private Car selectCarMake(@PathVariable String make){
    return new Car(make);
  }

  @GetMapping("/selectModel/{model}")
  private Car returnModel(@PathVariable String model){
    return new Car("Chevy", model);
  }

}
