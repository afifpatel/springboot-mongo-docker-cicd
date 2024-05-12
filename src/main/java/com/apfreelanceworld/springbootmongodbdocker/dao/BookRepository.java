package com.apfreelanceworld.springbootmongodbdocker.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.apfreelanceworld.springbootmongodbdocker.model.Book;

public interface BookRepository extends MongoRepository<Book, Integer> {}
