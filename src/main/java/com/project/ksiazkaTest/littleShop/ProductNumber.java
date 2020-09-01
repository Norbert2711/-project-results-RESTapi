package com.project.ksiazkaTest.littleShop;

import java.util.Objects;

public class ProductNumber {

    public int number;
    public Product product;

    public ProductNumber(int number, Product product) {
        this.number = number;
        this.product = product;
    }

    public int getNumber() {
        return number;
    }

    public Product getProduct() {
        return product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductNumber that = (ProductNumber) o;
        return number == that.number &&
                Objects.equals(product, that.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, product);
    }

    @Override
    public String toString() {
        return "Product: " +
                "number= " + number +
                ", product name= " + product +".";
    }
}

