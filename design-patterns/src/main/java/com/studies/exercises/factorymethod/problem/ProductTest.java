package com.studies.exercises.factorymethod.problem;

public class ProductTest {
    public static void main(String[] args) {
        DigitalProduct digitalProduct = new DigitalProduct();
        digitalProduct.setHasPhysicalDimensions(true);

        PhysicalProduct physicalProduct = new PhysicalProduct();
        physicalProduct.setHasPhysicalDimensions(false);
    }   
}
