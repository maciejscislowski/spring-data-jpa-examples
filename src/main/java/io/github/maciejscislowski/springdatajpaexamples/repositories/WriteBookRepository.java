package io.github.maciejscislowski.springdatajpaexamples.repositories;

/**
 * @author Maciej.Scislowski@gmail.com
 */
public interface WriteBookRepository {

    Book save(Book book);

}
