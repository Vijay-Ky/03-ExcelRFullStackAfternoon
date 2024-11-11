package com.excelr.ecommerce.book.store.main.daoimpl;


import com.excelr.ecommerce.book.store.main.dao.UserPaymentService;
import com.excelr.ecommerce.book.store.main.entities.UserPayment;
import com.excelr.ecommerce.book.store.main.repositories.UserPaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserPaymentServiceImpl implements UserPaymentService
{
    @Autowired
    private UserPaymentRepository userPaymentRepository;

    public UserPayment findById(Long id)
    {
        return userPaymentRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Long id)
    {
        userPaymentRepository.deleteById(id);
    }
}
