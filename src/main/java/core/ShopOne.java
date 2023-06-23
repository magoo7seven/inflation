package core;

import java.util.ArrayList;
import java.util.List;

/**
 * initial class for first shop
 */
public class ShopOne implements IPrices{

    /**
     * List of all products placed in current shop
     */
    private List<Product> allShopProducts = new ArrayList<>();

    Product product1 = new Product("Lays Paprika", 5.95);
    Product product2 = new Product("Pepsi", 10.25);
    Product product3 = new Product("Onion", 7.95);
    Product product4 = new Product("Red Paprika", 15.75);
    Product product5 = new Product("Chocolate", 2.95);
    Product product6 = new Product("Milk", 1.95);

    public List<Product> getAllShopProducts() {
        allShopProducts.add(product1);
        allShopProducts.add(product2);
        allShopProducts.add(product3);
        allShopProducts.add(product4);
        allShopProducts.add(product5);
        allShopProducts.add(product6);
        return allShopProducts;
    }

    @Override
    public double priceIncrease() {
        return 0;
    }

    @Override
    public double priceDecrease() {
        return 0;
    }
}
