package com.abuabdul.practice.mockito.application;

import java.util.logging.Logger;

/**
 * Created by abuabdul on 5/9/2015.
 */
public class Application extends AbstractApplication {

    private final static Logger logger = Logger.getLogger(Application.class.getName());

    private ApplicationName app;
    private ApplicationRunConfig appRunConfig;

    public Application() {
    }

    public Application buildWith(ApplicationName app){
        this.app = app;
        return this;
    }

    public Application addAppRunConfig(ApplicationRunConfig appRunConfig) {
        this.appRunConfig = appRunConfig;
        return this;
    }

    @Override
    public void startApplication() {
        logger.info("Running " + this.app.getAppName() + " Application...");
        this.appRunConfig.run();
        logger.info("Stopping " + app.getAppName() + " Application...");
        logger.info("Thank you!!! Please visit again");
    }

    /* NO Need to stop the application. Each application takes cares of the application shutdown. */

    @Override
    public String toString() {
        return "Application{" +
                "appName='" + app.getAppName() + '\'' +
                '}';
    }
}
