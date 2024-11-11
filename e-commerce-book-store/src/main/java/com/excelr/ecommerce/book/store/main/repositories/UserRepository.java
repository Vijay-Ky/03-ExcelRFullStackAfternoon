package com.excelr.ecommerce.book.store.main.repositories;

import com.excelr.ecommerce.book.store.main.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long>
{
    User findByUsername(String username);

    User findByEmail(String email);
}