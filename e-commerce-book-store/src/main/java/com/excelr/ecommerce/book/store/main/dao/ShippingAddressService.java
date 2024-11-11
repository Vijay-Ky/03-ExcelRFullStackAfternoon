package com.excelr.ecommerce.book.store.main.dao;

import com.excelr.ecommerce.book.store.main.entities.ShippingAddress;
import com.excelr.ecommerce.book.store.main.entities.UserShipping;

public interface ShippingAddressService {
    ShippingAddress setByUserShipping(UserShipping userShipping, ShippingAddress shippingAddress);
}
