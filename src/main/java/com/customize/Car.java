package com.customize;

public class Car {

  private String make;
  private String model;
  private String color;
  private String engine;
  private String engineSize;
  private String transmission;
  private String interior;

  public Car(String make, String model) {
    this.make = make;
    this.model = model;
  }

  public Car(String make){
    this.make = make;
  }

  public String getMake() {
    if(this.make.equals(" ")){
      return "zero";
    }
    return make;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getEngine() {
    return engine;
  }

  public void setEngine(String engine) {
    this.engine = engine;
  }

  public String getEngineSize() {
    return engineSize;
  }

  public void setEngineSize(String engineSize) {
    this.engineSize = engineSize;
  }

  public String getTransmission() {
    return transmission;
  }

  public void setTransmission(String transmission) {
    this.transmission = transmission;
  }

  public String getInterior() {
    return interior;
  }

  public void setInterior(String interior) {
    this.interior = interior;
  }
}//End of class
