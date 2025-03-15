/*
package com.example.userBorrowBook.controller;

import com.example.userBorrowBook.model.Book;
import com.example.userBorrowBook.service.BookService;
import jakarta.validation.constraints.Min;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import java.util.List;

@Controller
public class BookWebController {

    @Autowired
    BookService bookService;

    // Add default handler for root URL
    @GetMapping("/")
    public String homeRedirect() {
        return "redirect:/page/1";
    }


    @GetMapping("/page/{pageNo}")
    public String booksPaginated(
            @PathVariable @Min(1) int pageNo,
            Model model
    ) {
        final int PAGE_SIZE = 5;
        Page<Book> page = bookService.findPaginated(pageNo, PAGE_SIZE);

        // Handle upper bound
        if(pageNo > page.getTotalPages()) {
            return "redirect:/page/" + page.getTotalPages();
        }

        model.addAttribute("currentPage", pageNo);
        model.addAttribute("totalPages", page.getTotalPages());
        model.addAttribute("totalItems", page.getTotalElements());
        model.addAttribute("listBooks", page.getContent());

        return "books";
    }

    @ExceptionHandler({
            IllegalArgumentException.class,
            MethodArgumentTypeMismatchException.class
    })
    public String handleInvalidRequests() {
        return "redirect:/page/1";
    }

    // Exception handler for invalid page numbers
    @ExceptionHandler(IllegalArgumentException.class)
    public String handleInvalidPage() {
        return "redirect:/page/1";
    }

    // Handle type mismatch errors
    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public String handleTypeMismatch() {
        return "redirect:/page/1";
    }
}*/
