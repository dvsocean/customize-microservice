package com.customize;

public class Car {

  private String make;
  private String model;
  private String color;
  private String engine;

  public Car(String make, String model, String color, String engine) {
    this.make = make;
    this.model = model;
    this.color = color;
    this.engine = engine;
  }

  public String getMake() {
    return make;
  }

  public String getModel() {
    return model;
  }

  public String getColor() {
    return color;
  }

  public String getEngine() {
    return engine;
  }
}
