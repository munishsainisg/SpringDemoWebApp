package app.repository;

import org.springframework.data.repository.CrudRepository;

import app.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
