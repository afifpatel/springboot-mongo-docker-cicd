package com.apfreelanceworld.springbootmongodbdocker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apfreelanceworld.springbootmongodbdocker.dao.BookRepository;
import com.apfreelanceworld.springbootmongodbdocker.model.Book;

@Service
public class BookService {

    @Autowired
    private BookRepository repository;
    public Book saveBook(Book book) {
        return repository.save(book);
    }

    public List<Book> getBooks() {
        return repository.findAll();
    }
}
