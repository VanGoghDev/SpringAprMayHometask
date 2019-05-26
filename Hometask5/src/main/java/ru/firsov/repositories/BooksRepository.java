package ru.firsov.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import ru.firsov.entities.Book;

@Repository
public interface BooksRepository extends PagingAndSortingRepository<Book, Long> {
}
