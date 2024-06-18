package com.studies.exercises.factorymethod.solution;

import com.studies.exercises.factorymethod.problem.DigitalProduct;
import com.studies.exercises.factorymethod.problem.PhysicalProduct;
import com.studies.exercises.factorymethod.problem.Product;
import com.studies.exercises.factorymethod.problem.ProductTypeEnum;

public class ProductFactory {

    public static Product getInstance(ProductTypeEnum productTypeEnum){
        switch(productTypeEnum){
            case PHYSICAL:
                PhysicalProduct physicalProduct = new PhysicalProduct();
                physicalProduct.setHasPhysicalDimensions(true);
                return physicalProduct;

            case DIGITAL:
                DigitalProduct digitalProduct = new DigitalProduct();
                digitalProduct.setHasPhysicalDimensions(false);
                return digitalProduct;

            default:
                throw new IllegalArgumentException("Invalid Product Type");
        }
    }
}
