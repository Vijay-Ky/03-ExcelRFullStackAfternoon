package com.excelr.ecommerce.book.store.main.repositories;

import com.excelr.ecommerce.book.store.main.entities.UserPayment;
import org.springframework.data.repository.CrudRepository;

public interface UserPaymentRepository extends CrudRepository<UserPayment, Long>
{

}