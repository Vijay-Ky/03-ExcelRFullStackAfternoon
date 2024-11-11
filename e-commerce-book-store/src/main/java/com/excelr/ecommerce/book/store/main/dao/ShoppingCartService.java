package com.excelr.ecommerce.book.store.main.dao;

import com.excelr.ecommerce.book.store.main.entities.ShoppingCart;

public interface ShoppingCartService {
    ShoppingCart updateShoppingCart(ShoppingCart shoppingCart);

    void clearShoppingCart(ShoppingCart shoppingCart);
}

