package com.graphql.learn.services.impl;

import com.graphql.learn.entities.Book;
import com.graphql.learn.repositories.BookRep;
import com.graphql.learn.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRep bookRep;

    @Override
    public Book create(Book book) {
        return this.bookRep.save(book);
    }

    @Override
    public List<Book> getAll() {
        return bookRep.findAll();
    }

    @Override
    public Book get(int bookId) {
        return this.bookRep.findById(bookId).orElseThrow(()->new RuntimeException("Book your looking is not found in the service"));
    }
}
