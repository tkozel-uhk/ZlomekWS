package cz.uhk.zlomekws;

import cz.uhk.zlomekws.ws.ZlomekWSImpl;
import jakarta.xml.ws.Endpoint;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ZlomekWsApp {

    @Autowired
    Bus bus;

    @Bean
    public Endpoint endpoint() {
        Endpoint endpoint = new EndpointImpl(bus, new ZlomekWSImpl());
        endpoint.publish("/zlomek");
        return endpoint;
    }

    public static void main(String[] args) {
        SpringApplication.run(ZlomekWsApp.class, args);
    }

}
