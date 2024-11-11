package com.excelr.ecommerce.book.store.main.daoimpl;


import com.excelr.ecommerce.book.store.main.dao.UserShippingService;
import com.excelr.ecommerce.book.store.main.entities.UserShipping;
import com.excelr.ecommerce.book.store.main.repositories.UserShippingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserShippingServiceImpl implements UserShippingService
{

    @Autowired
    private UserShippingRepository userShippingRepository;


    public UserShipping findById(Long id) {
        return userShippingRepository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        userShippingRepository.deleteById(id);
    }

}

