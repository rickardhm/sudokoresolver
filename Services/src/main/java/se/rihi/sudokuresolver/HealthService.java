package se.rihi.sudokuresolver;

import se.rihi.sudokoresolver.application.HealthImpl;
import se.rihi.sudokuresolver.domain.Health;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by Rickard on 2017-12-05.
 */
@WebService
public class HealthService {

    Health health = new HealthImpl();

    @WebMethod(operationName = "ping")
    public String Ping() {
        return health.Ping();
    }
}
