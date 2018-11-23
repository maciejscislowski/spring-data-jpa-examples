package io.github.maciejscislowski.springdatajpaexamples.repositories;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Maciej.Scislowski@gmail.com
 */
@Component
@RequiredArgsConstructor
public class BookService {

    private final ReadBookRepository readBookRepository;
    private final WriteBookRepository writeBookRepository;

    public void addBook(String title) {
        writeBookRepository.save(Book.builder().title("New Title").build());
    }

    public List<Book> getAllBooks() {
        return readBookRepository.findAll();
    }

}
