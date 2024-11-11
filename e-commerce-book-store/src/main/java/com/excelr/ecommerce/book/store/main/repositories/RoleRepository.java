package com.excelr.ecommerce.book.store.main.repositories;


import com.excelr.ecommerce.book.store.main.security.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role, Long>
{
    Role findByname(String name);
}

