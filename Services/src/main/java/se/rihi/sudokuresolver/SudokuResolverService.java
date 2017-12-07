package se.rihi.sudokuresolver;

import org.springframework.beans.factory.annotation.Autowired;
import se.rihi.sudokuresolver.configuration.Support;

/**
 * Created by Rickard on 2017-12-05.
 */
public class SudokuResolverService {

    @Autowired
    private HealthService healthService;

    public SudokuResolverService() {
        healthService = (HealthService) Support.ctx.getBean("healthbean");
    }

    public static void main(String[] args) {
     SudokuResolverService service = new SudokuResolverService();
     service.run();
//     Endpoint.publish("http://localhost:9090/sudokuservice/ping", new HealthService());
    }

    private void run() {
        System.out.println(healthService.Ping());
    }
}
