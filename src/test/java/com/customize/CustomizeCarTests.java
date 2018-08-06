package com.customize;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CustomizeCarTests {

  private Garage garage;

  @Before
  public void setUp() throws Exception {
    garage = new Garage();
  }

  @Test
  public void shouldBeAbleToSelectMake() throws NoMakeSelectedError {
    Car car = garage.selectMake("Honda");
    assertEquals("Honda", car.getMake());
  }

  @Test(expected = NoMakeSelectedError.class)
  public void shouldThrowErrorIfNoCarIsSelected() throws NoMakeSelectedError {
    assertEquals("Honda", garage.selectMake("").getMake());
  }
}
