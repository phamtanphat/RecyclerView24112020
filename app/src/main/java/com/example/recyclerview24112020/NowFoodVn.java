package com.example.recyclerview24112020;

import java.util.Arrays;

public class NowFoodVn {
    private Boolean status;
    private Integer image;
    private String name;
    private String[] arrayAddress;
    private Integer minPrice;
    private Integer price;
    private String saleOff;
    private String[] category;

    // alt + insert : generate
    public NowFoodVn(Boolean status, Integer image, String name, String[] arrayAddress, Integer minPrice, Integer price, String saleOff, String[] category) {
        this.status = status;
        this.image = image;
        this.name = name;
        this.arrayAddress = arrayAddress;
        this.minPrice = minPrice;
        this.price = price;
        this.saleOff = saleOff;
        this.category = category;
    }

    public NowFoodVn() {
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getArrayAddress() {
        return arrayAddress;
    }

    public void setArrayAddress(String[] arrayAddress) {
        this.arrayAddress = arrayAddress;
    }

    public Integer getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(Integer minPrice) {
        this.minPrice = minPrice;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getSaleOff() {
        return saleOff;
    }

    public void setSaleOff(String saleOff) {
        this.saleOff = saleOff;
    }

    public String[] getCategory() {
        return category;
    }

    public void setCategory(String[] category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "NowFoodVn{" +
                "status=" + status +
                ", image=" + image +
                ", name='" + name + '\'' +
                ", arrayAddress=" + Arrays.toString(arrayAddress) +
                ", minPrice=" + minPrice +
                ", price=" + price +
                ", saleOff='" + saleOff + '\'' +
                ", category=" + Arrays.toString(category) +
                '}';
    }
}
