package ru.eremin;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.ApplicationContext;

import java.util.Date;


@Slf4j
@EnableConfigServer
@SpringBootApplication
public class ConfigServerApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ConfigServerApplication.class, args);
        log.info("app ConfigServer started on {}", new Date(context.getStartupDate()));
    }
}
