package com.interfacetest.interfacetest2;

import com.interfacetest.interfacetest2.initializer.SecondInitializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:applicationContext.xml")
public class Interfacetest2Application {

    public static void main(String[] args) {
        SpringApplication.run(Interfacetest2Application.class, args);

//        SpringApplication springApplication = new SpringApplication(Interfacetest2Application.class);
//        springApplication.addInitializers(new SecondInitializer());
//        springApplication.run();

//        ConfigurableApplicationContext context = SpringApplication.run(Interfacetest2Application.class, args);
//        System.out.println(context.getEnvironment().getProperty("file.property"));
//        System.out.println(context.getEnvironment().getProperty("file.list"));
//        context.close();
    }

}
