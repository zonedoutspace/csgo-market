package com.petersoboyejo.csgomarket;

public class ImageRecord {
    private String itemImage;
    private String itemName;
    private String itemPrice;
    private String itemCase;
    private String subOne;
    private String subTwo;


    public ImageRecord(String itemImage, String itemName, String itemPrice, String itemCase, String subOne, String subTwo) {
        this.itemImage = itemImage;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemCase = itemCase;
        this.subOne = subOne;
        this.subTwo = subTwo;

    }

    public String getItemImage() {
        return itemImage;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemPrice() {
        return itemPrice;
    }
    public String getItemCase() {
        return itemCase;
    }
    public String getSubOne() {
        return subOne;
    }
    public String getSubTwo() {
        return subTwo;
    }
}
