package com.customize.controllers;

import com.customize.Car;
import com.customize.Garage;
import com.customize.NoMakeSelectedError;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GarageController {

  private Garage garage = new Garage();

  @GetMapping("/showGarage")
  private List<Car> selectMakeController(){
    return garage.garageList();
  }

  @PostMapping("/selectMake")
  private Car selectMake(@RequestParam("make") String make) throws NoMakeSelectedError {
    return garage.selectMake(make);
  }



}
