package com.excelr.ecommerce.book.store.main.dao;


import com.excelr.ecommerce.book.store.main.entities.*;

public interface OrderService {
    Order createOrder(ShoppingCart shoppingCart,
                      ShippingAddress shippingAddress,
                      BillingAddress billingAddress,
                      Payment payment,
                      String shippingMethod,
                      User user);

    Order findById(Long id);
}
