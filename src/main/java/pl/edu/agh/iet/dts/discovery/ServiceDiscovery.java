package pl.edu.agh.iet.dts.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Bartłomiej Grochal
 */
@SpringBootApplication
@EnableEurekaServer
public class ServiceDiscovery {

    public static void main(String[] args) {
        SpringApplication.run(ServiceDiscovery.class, args);
    }

}
