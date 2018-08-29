package app.repository;

import org.springframework.data.repository.CrudRepository;

import app.model.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
