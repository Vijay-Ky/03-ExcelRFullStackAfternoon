package com.excelr.ecommerce.book.store.main.dao;

import com.excelr.ecommerce.book.store.main.entities.UserPayment;

public interface UserPaymentService
{
    UserPayment findById(Long id);
    void deleteById(Long id);
}
