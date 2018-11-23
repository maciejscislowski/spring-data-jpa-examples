package io.github.maciejscislowski.springdatajpaexamples.repositories;

import java.util.List;
import java.util.Optional;

/**
 * @author Maciej.Scislowski@gmail.com
 */
public interface ReadBookRepository {

    Optional<Book> findById(Long id);

    Optional<Book> findByTitle(String title);

    List<Book> findAll();

}
