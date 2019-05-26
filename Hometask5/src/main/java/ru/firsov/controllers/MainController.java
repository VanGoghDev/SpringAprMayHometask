package ru.firsov.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.firsov.entities.Book;
import ru.firsov.services.BooksService;

import java.util.List;

@Controller
public class MainController {
    private BooksService booksService;

    @Autowired
    public void setBooksService(BooksService booksService) {
        this.booksService = booksService;
    }

    @RequestMapping("/home")
    public String showHomePage() {
        return "index";
    }

    @RequestMapping("/list")
    public String showBookList(Model model) {
        List<Book> booksList = booksService.getAllBooks();
        model.addAttribute("booksList", booksList);
        return "books-list";
    }

    @GetMapping("book/add")
    public String addBookPage(Model model) {
        Book book = new Book();
        model.addAttribute("book", book);
        return "addBook";
    }

    @PostMapping("/save")
    public String save(final Model Model, @ModelAttribute("book") Book book) {
        booksService.save(book);
        return "redirect:/";
    }
}
