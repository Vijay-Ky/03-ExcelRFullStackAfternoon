package com.excelr.ecommerce.book.store.main.dao;

import com.excelr.ecommerce.book.store.main.entities.UserShipping;

public interface UserShippingService {
    UserShipping findById(Long id);

    void deleteById(Long id);
}
