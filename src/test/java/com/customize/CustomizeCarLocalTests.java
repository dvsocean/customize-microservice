package com.customize;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CustomizeCarLocalTests {

  private Garage garage = new Garage();

  @Test
  public void shouldBeAbleToSelectModel() {
    Cars car = garage.selectModel("Modena");
    assertEquals("Modena", car.getModel());
  }

  @Test
  public void shouldBeAbleToSelectMake(){
    Cars car = garage.selectMake("Honda");
    assertEquals("Honda", car.getMake());
  }

  @Test
  public void shouldBeAbleToSelectColor(){
    Cars car = garage.selectColor("Black");
    assertEquals("Black", car.getColor());
  }

  @Test
  public void shouldBeAbleToSelectEngine(){
    Cars car = garage.selectEngine("v12");
    assertEquals("v12", car.getEngine());
  }

  @Test
  public void shouldBeAbleToSelectEngineSize(){
    Cars car = garage.selectEngineSize("8 liters");
    assertEquals("8 liters", car.getEngineSize());
  }

  @Test
  public void shouldBeAbleToSelectTransmission(){
    Cars car = garage.selectTransmission("Automatic");
    assertEquals("Automatic", car.getTransmission());
  }

  @Test
  public void shouldBeAbleToSelectInterior(){
    Cars car = garage.selectInterior("Black and yellow");
    assertEquals("Black and yellow", car.getInterior());
  }

  @Test
  public void shouldReturnBlackIfInteriorColorNotSelected(){
    Cars car = garage.selectInterior("");
    assertEquals("Black", car.getInterior());
  }

  @Test
  public void shouldReturnDefaultEngineIfNoSelectionIsMade() {

  }




}//End of class
