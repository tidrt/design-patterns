package com.studies.exercises.factorymethod.problem;

public class Product {

    private String name;
    private double price;
    private boolean hasPhysicalDimensions;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isHasPhysicalDimensions() {
        return hasPhysicalDimensions;
    }

    public void setHasPhysicalDimensions(boolean hasPhysicalDimensions) {
        this.hasPhysicalDimensions = hasPhysicalDimensions;
    }
 
    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", hasPhysicalDimensions=" + hasPhysicalDimensions +
                '}';
    }
}
