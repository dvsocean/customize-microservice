package com.customize.controllers;

import com.customize.Cars;
import com.customize.Garage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GarageController {

  @Autowired
  Garage garage;

  @PostMapping("/selectMake")
  public Cars selectMake(@RequestParam("make") String make){
    Cars car = garage.selectMake("Honda");
    return car;
  }
}
