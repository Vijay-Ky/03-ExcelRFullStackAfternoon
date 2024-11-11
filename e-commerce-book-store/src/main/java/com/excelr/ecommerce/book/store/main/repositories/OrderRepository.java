package com.excelr.ecommerce.book.store.main.repositories;

import com.excelr.ecommerce.book.store.main.entities.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long>
{

}