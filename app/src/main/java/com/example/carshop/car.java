package com.example.carshop;

public class car {

    private String name;
    private String description ;
    private int carImage;
    private int count;

    public car(String name, String description, int carImage){

        this.name=name;
        this.description=description;
        this.count=0;
        this.carImage=carImage;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCarImage() {
        return this.carImage;
    }

    public void setCarImage(int carImage) {
        this.carImage = carImage;
    }
    public int getCount() { return this.count; }
    public void setCount(int count) { this.count = count; }


}
