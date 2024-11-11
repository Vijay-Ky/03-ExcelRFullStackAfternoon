package com.excelr.ecommerce.book.store.main.repositories;

import com.excelr.ecommerce.book.store.main.entities.BookToCartItem;
import com.excelr.ecommerce.book.store.main.entities.CartItem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface BookToCartItemRepository extends CrudRepository<BookToCartItem, Long>
{

    void deleteByCartItem(CartItem cartItem);

}