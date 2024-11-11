package com.excelr.ecommerce.book.store.main.daoimpl;


import com.excelr.ecommerce.book.store.main.dao.PaymentService;
import com.excelr.ecommerce.book.store.main.entities.Payment;
import com.excelr.ecommerce.book.store.main.entities.UserPayment;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService
{

    public Payment setByUserPayment(UserPayment userPayment, Payment payment) {

        payment.setType(userPayment.getType());
        payment.setHolderName(userPayment.getHolderName());
        payment.setCardNumber(userPayment.getCardNumber());
        payment.setExpiryMonth(userPayment.getExpiryMonth());
        payment.setExpiryYear(userPayment.getExpiryYear());
        payment.setCvc(userPayment.getCvc());

        return payment;
    }

}

