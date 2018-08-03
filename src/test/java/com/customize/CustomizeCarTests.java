package com.customize;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
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
@AutoConfigureMockMvc
@SpringBootTest
public class CustomizeCarTests {

  @Autowired
  private MockMvc mockMvc;

  @Test
  public void shouldBeAbleToSelectMake() throws Exception {
    mockMvc.perform(get("/selectMake/Honda")).andExpect(status().isOk())
        .andExpect(jsonPath("make").value("Honda"));
  }

  @Test
  public void shouldBeAbleToSelectCarModel() throws Exception {
    mockMvc.perform(get("/selectModel/Silverado")).andExpect(status().isOk())
        .andExpect(jsonPath("model").value("Silverado"));
  }
}