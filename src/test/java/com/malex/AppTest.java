package com.malex;

import io.vertx.core.Vertx;
import io.vertx.ext.unit.Async;
import io.vertx.ext.unit.TestContext;
import io.vertx.ext.unit.junit.VertxUnitRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(VertxUnitRunner.class)
public class AppTest
{
    private Vertx vertx;

    @Before
    public void setUp(TestContext context)
    {
        vertx = Vertx.vertx();
        vertx.deployVerticle(App.class.getName(), context.asyncAssertSuccess());
    }

    @Test
    public void test(TestContext context)
    {
        Async async = context.async();
        
    }

    @After
    public void tearDown(TestContext context)
    {
        vertx.close(context.asyncAssertSuccess());
    }
}