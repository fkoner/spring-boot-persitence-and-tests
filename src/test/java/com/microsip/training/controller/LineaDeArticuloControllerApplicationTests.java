/*
 * Copyright 2012-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.microsip.training.controller;

import com.microsip.training.models.LineaDeArticulo;
import com.microsip.training.models.RolClaveArticulo;
import com.microsip.training.repos.Articulos;
import com.microsip.training.repos.LineasDeArticulos;
import com.microsip.training.service.RolesClavesArticulosServiceTest;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.PageImpl;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;


import java.util.Arrays;

import static org.mockito.BDDMockito.given;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.anyVararg;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

//@Ignore
@RunWith(SpringRunner.class)
//@SpringBootTest
//@AutoConfigureMockMvc
//@AutoConfigureTestDatabase
@WebMvcTest(LineaDeArticuloController.class)
public class LineaDeArticuloControllerApplicationTests {

	private Logger logger = LoggerFactory.getLogger(LineaDeArticuloControllerApplicationTests.class);

	@Autowired
	private MockMvc mvc;

	@Autowired
	private ApplicationContext applicationContext;

	@MockBean
	private LineasDeArticulos lineasDeArticulos;

	@MockBean
	//@Autowired
	private Articulos articulos;

	@Test
	public void getLineaDeArticulo() throws Exception {
		LineaDeArticulo lineaDeArticulo = new LineaDeArticulo();
		lineaDeArticulo.setId(1L);
		lineaDeArticulo.setNombre("Linea 1");
		given(this.lineasDeArticulos.findOne(anyLong()))
				.willReturn(lineaDeArticulo);
		this.mvc.perform(get("/api/lineas/1").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(content().string("{\"id\":1,\"nombre\":\"Linea 1\"}"));
	}

}
