package com.abuabdul.practice.mockito.application;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.mockito.Mockito.verify;

/**
 * Created by abuabdul on 5/16/2015.
 */
public class ApplicationTest {

    @Mock
    ApplicationRunConfig appRunConfig;
    @InjectMocks
    Application application;

    @BeforeClass
    public void setup(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void should_start_application(){
        //GIVEN
        application.buildWith(ApplicationName.FLIPKART_APP);
        //WHEN
        application.startApplication();
        //VERIFY
        verify(appRunConfig).run();
    }
}