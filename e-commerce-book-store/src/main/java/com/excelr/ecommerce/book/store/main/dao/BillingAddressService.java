package com.excelr.ecommerce.book.store.main.dao;
import com.excelr.ecommerce.book.store.main.entities.BillingAddress;
import com.excelr.ecommerce.book.store.main.entities.UserBilling;

public interface BillingAddressService
{
    BillingAddress setByUserBilling(UserBilling userBilling, BillingAddress billingAddress);
}

