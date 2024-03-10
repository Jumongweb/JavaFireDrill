package estore;

import java.math.BigDecimal;

public class Product {
    private int id;
    private String name;
    private Double price;
    private String description;
    private ProductCategory category;

    public Product(int id, String name, double price, String description, ProductCategory category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public ProductCategory getCategory() {
        return category;
    }

    @Override
    public String toString(){
        return String.format("""
                       %nName: %s%n
                       price: %.2f%n
                       Description: %s%n
                       Product category: %s""",
                getName(), getPrice(), getDescription(), getCategory());
    }

}
