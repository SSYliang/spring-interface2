package com.interfacetest.interfacetest2.util;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

@Component
public class MyEnvironmentPropertySource implements EnvironmentPostProcessor {

    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(
                    "D:\\Idea-Projects\\interfacetest2\\src\\main\\resources\\custom.properties"));

            Properties properties = new Properties();
            properties.load(fileInputStream);

            //第一个参数自定义
            PropertiesPropertySource propertySource = new PropertiesPropertySource("my", properties);
            environment.getPropertySources().addLast(propertySource);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
