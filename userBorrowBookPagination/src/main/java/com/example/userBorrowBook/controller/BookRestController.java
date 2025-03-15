package com.example.userBorrowBook.controller;

import com.example.userBorrowBook.model.Book;
import com.example.userBorrowBook.repository.BookRepository;
import com.example.userBorrowBook.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@RestController
@RequestMapping("/api/v1/books")
public class BookRestController {
    //here we are creating our end-point rest API
    @Autowired
    BookRepository bookRepository;

    private final BookService bookService;

    @Autowired
    public BookRestController(BookService bookService) {
        this.bookService = bookService;
    }

    //CRUD: read
    @GetMapping
    public Page bookPageable(Pageable pageable) {
        return bookRepository.findAll(pageable);
    }

    @GetMapping("/page/{pageNo}")
    public Page<Book> getBooksPaginated(@PathVariable int pageNo) {
        final int PAGE_SIZE = 5;
        return bookService.findPaginated(pageNo, PAGE_SIZE);
    }


}
