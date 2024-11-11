package com.excelr.ecommerce.book.store.main.repositories;


import com.excelr.ecommerce.book.store.main.entities.CartItem;
import com.excelr.ecommerce.book.store.main.entities.Order;
import com.excelr.ecommerce.book.store.main.entities.ShoppingCart;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CartItemRepository extends CrudRepository<CartItem, Long>
{

    List<CartItem> findByShoppingCart(ShoppingCart shoppingCart);

    List<CartItem> findByOrder(Order order);
}

