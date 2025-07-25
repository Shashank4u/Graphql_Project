package com.graphql.learn.services;

import com.graphql.learn.entities.Book;

import java.util.List;

public interface BookServices {
    //Create
    Book create(Book book);

    //get all
    List<Book> getALl();

    //get single Book
    Book get(int bookId);

}
