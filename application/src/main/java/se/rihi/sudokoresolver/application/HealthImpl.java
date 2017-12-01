package se.rihi.sudokoresolver.application;

import se.rihi.sudokuresolver.domain.Health;

import java.util.ResourceBundle;

/**
 * Created by rickard on 2017-12-01.
 */
public class HealthImpl implements Health {

    private final ResourceBundle resourceBundle = ResourceBundle.getBundle("sudoku");

    public String Ping() {
        return resourceBundle.getString("PING");
    }
}
