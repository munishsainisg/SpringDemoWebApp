package app.repository;

import org.springframework.data.repository.CrudRepository;

import app.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}
