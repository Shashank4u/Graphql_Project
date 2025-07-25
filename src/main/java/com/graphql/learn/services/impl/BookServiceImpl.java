package com.graphql.learn.services.impl;

import com.graphql.learn.entities.Book;
import com.graphql.learn.repositories.BookRep;
import com.graphql.learn.services.BookServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImpl implements BookServices {

    private BookRep bookRep;
    @Autowired
    @Override
    public Book create(Book book) {
        return null;
    }

    @Override
    public List<Book> getALl() {
        return List.of();
    }

    @Override
    public Book get(int bookId) {
        return null;
    }
}
