package com.excelr.ecommerce.book.store.main.repositories;

import com.excelr.ecommerce.book.store.main.entities.ShoppingCart;
import org.springframework.data.repository.CrudRepository;

public interface ShoppingCartRepository extends CrudRepository<ShoppingCart, Long>
{

}
