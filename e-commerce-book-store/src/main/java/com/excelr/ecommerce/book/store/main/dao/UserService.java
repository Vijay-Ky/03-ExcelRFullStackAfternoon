package com.excelr.ecommerce.book.store.main.dao;


import com.excelr.ecommerce.book.store.main.entities.User;
import com.excelr.ecommerce.book.store.main.entities.UserBilling;
import com.excelr.ecommerce.book.store.main.entities.UserPayment;
import com.excelr.ecommerce.book.store.main.entities.UserShipping;
import com.excelr.ecommerce.book.store.main.security.PasswordResetToken;
import com.excelr.ecommerce.book.store.main.security.UserRole;

import java.util.Set;

public interface UserService {
    PasswordResetToken getPasswordResetToken(final String token);

    void createPasswordResetTokenForUser(final User user, final String token);

    User findByUsername(String username);

    User findByEmail (String email);

    User findById(Long id);

    User createUser(User user, Set<UserRole> userRoles) throws Exception;

    User save(User user);

    void updateUserBilling(UserBilling userBilling, UserPayment userPayment, User user);

    void updateUserShipping(UserShipping userShipping, User user);

    void setUserDefaultPayment(Long userPaymentId, User user);

    void setUserDefaultShipping(Long userShippingId, User user);
}
