package io.github.maciejscislowski.springdatajpaexamples.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

/**
 * @author Maciej.Scislowski@gmail.com
 */
public interface BookJpaRepository extends ReadBookRepository, WriteBookRepository, JpaRepository<Book, Long> {

    Optional<Book> findByTitle(String title);

    List<Book> findAll();

}
