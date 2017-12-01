package se.rihi.sudokoresolver.application;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by rickard on 2017-12-01.
 */
public class HealthImplTest {

    @Test
    public void ping() throws Exception {
        HealthImpl health = new HealthImpl();
        assertEquals("pong", health.Ping());
    }

}