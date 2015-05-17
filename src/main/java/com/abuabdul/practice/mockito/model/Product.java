package com.abuabdul.practice.mockito.model;

/**
 * Created by abuabdul on 5/9/2015.
 */
public class Product {

    private String productName;
    private String productDescription;
    private String productID;
    private String make;
    private SellingInfo sellingInfo;

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public SellingInfo getSellingInfo() {
        return sellingInfo;
    }

    public void setSellingInfo(SellingInfo sellingInfo) {
        this.sellingInfo = sellingInfo;
    }

    public String getProductName() {

        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
