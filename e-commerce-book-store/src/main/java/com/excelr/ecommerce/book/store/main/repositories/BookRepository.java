package com.excelr.ecommerce.book.store.main.repositories;


import java.util.List;

import com.excelr.ecommerce.book.store.main.entities.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long>{

    List<Book> findByCategory(String category);

    List<Book> findByTitleContaining(String title);

}