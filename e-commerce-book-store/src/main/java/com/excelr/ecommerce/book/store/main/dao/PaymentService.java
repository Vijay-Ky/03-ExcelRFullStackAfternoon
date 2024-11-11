package com.excelr.ecommerce.book.store.main.dao;


import com.excelr.ecommerce.book.store.main.entities.Payment;
import com.excelr.ecommerce.book.store.main.entities.UserPayment;

public interface PaymentService {
    Payment setByUserPayment(UserPayment userPayment, Payment payment);
}
