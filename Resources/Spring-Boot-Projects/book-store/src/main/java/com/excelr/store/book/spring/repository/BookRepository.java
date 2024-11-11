package com.excelr.store.book.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.excelr.store.book.spring.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer>  {

}
