package com.excelr.ecommerce.book.store.main.dao;

import com.excelr.ecommerce.book.store.main.entities.Book;

import java.util.List;

public interface BookService
{
    List<Book> findAll ();

    Book findById(Long id);

    List<Book> findByCategory(String category);

    List<Book> blurrySearch(String title);
}
