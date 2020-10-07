package com.yibowang.shop.service;

import com.yibowang.shop.exception.NotEnoughProductsInStockException;
import com.yibowang.shop.model.Product;

import java.math.BigDecimal;
import java.util.Map;

public interface ShoppingCartService {
    void addProduct(Product product);

    void removeProduct(Product product);

    Map<Product, Integer> getProductsInCart();

    void checkout() throws NotEnoughProductsInStockException;

    BigDecimal getTotal();
}
