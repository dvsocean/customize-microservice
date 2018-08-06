package com.customize;

import static org.hamcrest.core.IsEqual.equalTo;

import io.restassured.RestAssured;
import org.junit.Test;

public class RestAssuredTests {

  @Test
  public void shoudlBeAbleToSelectMake(){
    RestAssured.given().param("make", "Honda").post("/selectMake")
        .then().body("make", equalTo("Honda"));
  }

  @Test
  public void shouldBeAbleToSelectModel(){
    RestAssured.given().param("model", "Accord").post("/selectModel")
        .then().body("model", equalTo("Accord"));
  }

  @Test
  public void shouldBeAbleToSelectColor(){
    RestAssured.given().param("color", "Silver").post("/selectColor")
        .then().body("color", equalTo("Silver"));
  }

}
