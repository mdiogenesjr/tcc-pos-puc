package br.com.sigo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("br.com.sigo")
public class CamelApplication {

    private static Logger logger = LogManager.getLogger(CamelApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(CamelApplication.class, args);
    }
}
