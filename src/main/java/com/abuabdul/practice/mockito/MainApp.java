package com.abuabdul.practice.mockito;

import com.abuabdul.practice.mockito.application.ApplicationName;
import com.abuabdul.practice.mockito.application.Application;
import com.abuabdul.practice.mockito.application.ecommerce.flipkart.FlipkartEcommerce;

import java.util.logging.Logger;

/**
 * Created by abuabdul on 5/9/2015.
 */
public class MainApp {

    private final static Logger logger = Logger.getLogger(MainApp.class.getName());

    public static void main(String... args) {
        logger.info("Mockito Practice with Flipkart Online Shopping: Started {0}");
        Application application = new Application().buildWith(ApplicationName.FLIPKART_APP).addAppRunConfig(new FlipkartEcommerce());
        logger.info("Mockito Practice with Flipkart Online Shopping: Starting");
        application.startApplication();
        logger.info("Mockito Practice with Flipkart Online Shopping: Terminated {0}");
    }
}
