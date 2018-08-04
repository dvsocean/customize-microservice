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
}
