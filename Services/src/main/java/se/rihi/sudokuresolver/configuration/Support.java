package se.rihi.sudokuresolver.configuration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Rickard on 2017-12-06.
 */
public class Support {
    public static AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
}
