package fr.service.preference;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author yannk
 *
 */
@SuppressWarnings("checkstyle:hideutilityclassconstructor")
@SpringBootApplication
public class Launcher {

    /**
     * @param args command line arguments.
     */
    public static void main(final String[] args) {
        SpringApplication.run(Launcher.class, args);
    }

}
