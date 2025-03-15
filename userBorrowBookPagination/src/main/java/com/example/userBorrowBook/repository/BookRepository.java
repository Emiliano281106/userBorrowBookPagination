package com.example.userBorrowBook.repository;


import com.example.userBorrowBook.model.Book;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BookRepository extends PagingAndSortingRepository<Book, String> {

}