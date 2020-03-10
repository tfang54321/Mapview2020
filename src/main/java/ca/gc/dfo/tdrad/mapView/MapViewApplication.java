package ca.gc.dfo.tdrad.mapView;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableCaching
@ComponentScan(basePackages = { "ca.gc.dfo.tdrad.mapView" })
public class MapViewApplication {

    public static void main(String[] args) {
        SpringApplication.run(MapViewApplication.class, args);
    }

}
