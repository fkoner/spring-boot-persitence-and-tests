package com.microsip.training.models;

import org.junit.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Carlos on 15/03/17.
 */
public class MonedaTest {

    private static Logger logger = LoggerFactory.getLogger(MonedaTest.class);

    @BeforeClass
    public static void before() {
        logger.info("before");
    }

    @Before
    public  void beforeMethod() {
        logger.info("beforeMethod");
    }

    @Test
    public void creacionNuevaMoneda() throws Exception {
        logger.info("creacionNuevaMoneda");
        Moneda moneda = new Moneda();
        moneda.setId(1L);
        moneda.setNombre("Moneda 1");
        moneda.setTipoMoneda(new TipoMoneda());
        Long expectedID = 1L;
        String expectedNombre = "Moneda 1";
        Assert.assertEquals(expectedID, moneda.getId());
        Assert.assertEquals(expectedNombre, moneda.getNombre());
        Assert.assertNotNull(null != moneda.getTipoMoneda());
    }

    @Test
    public void modificacionMoneda() throws Exception {
        logger.info("modificacionMoneda");
    }

    @After
    public  void afterMethod() {
        logger.info("afterMethod");
    }

    @AfterClass
    public static void after() {
        logger.info("after");
    }

}
