package com.customize;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

public class CustomizeCarTests {

  @Autowired
  private MockMvc mockMvc;

  private Garage garage;

  @Test
  public void shouldBeAbleToSelectMake() throws Exception {
    mockMvc.perform(get("/selectMake")).andExpect(status().isOk());
  }


}
