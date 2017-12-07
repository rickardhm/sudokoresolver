package se.rihi.sudokuresolver;

import org.springframework.stereotype.Component;
import se.rihi.sudokoresolver.application.HealthImpl;
import se.rihi.sudokuresolver.domain.Health;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by Rickard on 2017-12-05.
 */

/**
 * (serciceName = "health") is to explicitly declare the name of the Web Service. If you don’t use it, the service will be named after the class.
 */
@Component("healthbean")
@WebService(serviceName = "health")
public class HealthService {

    private Health health = new HealthImpl();

    /**
     * (operationName = "ping") attribute to the @WebMethod element. This is to explicitly declare the name of the method on the Web Service.
     * If you don’t use it, the method of the Web Service will be named after the method of the class.
     * @return A string
     */
    @WebMethod(operationName = "ping")
    public String Ping() {
        return health.Ping();
    }
}
