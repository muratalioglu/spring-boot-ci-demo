package com.example.springbootcidemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class SpringBootCiDemoApplicationTests {

	@Autowired
	private MainController mainController;

	@Autowired
	private MockMvc mockMvc;

	@Test
	void contextLoads() {
		assertNotNull(mainController);
	}

	@Test
	void testMainEndpoint() throws Exception {
		mockMvc
				.perform(get("/main"))
				.andExpect(status().isOk())
				.andExpect(content().string(containsString("selam")));
	}

	@Test
	void testSecondEndpoint() throws Exception {
		mockMvc
				.perform(get("/second"))
				.andExpect(status().isOk());
	}
}
