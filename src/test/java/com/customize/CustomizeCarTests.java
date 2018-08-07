package com.customize;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CustomizeCarTests {

  private Garage garage;

  @Before
  public void setUp() {
    garage = new Garage();
  }

  @Test
  public void shouldBeAbleToSelectMake() throws NoMakeSelectedError {
    Car car = garage.selectMake("Honda");
    assertEquals("Honda", car.getMake());
  }

  @Test(expected = NoMakeSelectedError.class)
  public void shouldThrowErrorIfNoCarIsSelected() throws NoMakeSelectedError {
    Car car = garage.selectMake("");
    assertEquals("", car.getMake());
  }

  @Test
  public void shouldBeAbleToSelectModel() throws NoModelSelectedError {
    assertEquals("Accord", garage.selectModel("Accord").getModel());
  }

  @Test(expected = NoModelSelectedError.class)
  public void shouldThrowErrorIfNoModelIsSelected() throws NoModelSelectedError {
    assertEquals("", garage.selectModel("").getModel());
  }

  @Test
  public void shouldBeAbleToSelectColor() {
    assertEquals("Silver", garage.selectColor("Silver").getColor());
  }

  @Test
  public void shouldDefaultToBlackWhenColorNotSelected() {
    assertEquals("Black", garage.selectColor("").getColor());
  }

  @Test
  public void shouldBeAbleToSelectEngine() throws NoEngineSelectedError { ;
    assertEquals("i4", garage.selectEngine("i4").getEngine());
  }

  @Test(expected = NoEngineSelectedError.class)
  public void shouldThrowErrorIfEngineNotSelected() throws NoEngineSelectedError {
    assertEquals("", garage.selectEngine("").getEngine());
  }

}//End of class

