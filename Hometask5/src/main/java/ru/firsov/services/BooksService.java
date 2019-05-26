package ru.firsov.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.firsov.entities.Book;
import ru.firsov.repositories.BooksRepository;

import java.util.List;

@Service
public class BooksService {
    private BooksRepository booksRepository;

    @Autowired
    public void setBooksRepository(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    public BooksService() {
    }

    public List<Book> getAllBooks() {
        return (List<Book>)booksRepository.findAll();
    }

    public void addBook(Book book) {
        booksRepository.save(book);
    }

    public void removeById(Long id) {
        booksRepository.deleteById(id);
    }

    public void save(Book book) {
        booksRepository.save(book);
    }
}
