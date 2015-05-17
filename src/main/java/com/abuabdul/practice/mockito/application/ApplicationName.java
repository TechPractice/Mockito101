package com.abuabdul.practice.mockito.application;

/**
 * Created by abuabdul on 5/9/2015.
 */
public enum ApplicationName {

    FLIPKART_APP("Flipkart"),
    AMAZON_APP("Amazon"),
    SNAPDEAL_APP("SnapDeal"),
    ZOVI_APP("Zovi");

    private String appName;

    ApplicationName(String appName){
      this.appName = appName;
    }

    public String getAppName(){
        return this.appName;
    }


}
