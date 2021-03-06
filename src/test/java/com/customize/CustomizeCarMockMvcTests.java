package com.customize;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class CustomizeCarMockMvcTests {

  @Autowired
  MockMvc mockMvc;

  private Garage garage = new Garage();

  @Test
  public void shouldBeAbleToSelectMake() throws Exception {
    mockMvc.perform(post("/selectMake").param("make", "Honda")).andExpect(status().isOk())
    .andExpect(jsonPath("make").value("Honda"));
  }

  @Test
  public void shouldBeAbleToSelectModel() throws Exception {
    mockMvc.perform(post("/selectModel").param("model", "Reventon")).andExpect(status().isOk())
        .andExpect(jsonPath("model").value("Reventon"));
  }

  @Test
  public void shouldBeAbleToSelectColor() throws Exception {
    mockMvc.perform(post("/selectColor").param("color", "Black")).andExpect(status().isOk())
        .andExpect(jsonPath("color").value("Black"));
  }
}