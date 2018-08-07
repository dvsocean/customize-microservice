package com.customize;

import static org.hamcrest.core.IsEqual.equalTo;

import io.restassured.RestAssured;
import org.junit.Before;
import org.junit.Test;

public class CustomizeCarRestAssuredTests {

  @Before
  public void setUp() throws Exception {
    RestAssured.baseURI = "http://localhost:5000";
  }

  @Test
  public void shouldBeAbleToSelectMake(){
    RestAssured.given().param("make", "Honda")
        .when()
        .post("/selectMake")
        .then()
        .statusCode(200)
        .body("make", equalTo("Honda"));
  }

  @Test
  public void shouldThrowErrorOnNoMakeSelection(){
    RestAssured.given().param("make", "")
        .when()
        .post("/selectMake")
        .then()
        .statusCode(500)
        .body("make", equalTo(null));
  }

}
