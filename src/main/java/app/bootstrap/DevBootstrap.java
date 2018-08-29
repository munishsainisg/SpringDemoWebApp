package app.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import app.model.Author;
import app.model.Book;
import app.model.Publisher;
import app.repository.AuthorRepository;
import app.repository.BookRepository;
import app.repository.PublisherRepository;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData(){

        //Eric
    	
    	Publisher publisher = new Publisher("Balaji","Mumbai");
    	publisherRepository.save(publisher);
    	 
        Author eric = new Author("Eric", "Evans");
        Book  ddd = new Book("Eric Book", "1234", publisher);
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(ddd);
       


        //Rod
        
        Publisher publisher2 = new Publisher("Yashraj","Mumbai");
        publisherRepository.save(publisher2);
        
        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("Rod Book", "23444", publisher2 );
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        authorRepository.save(rod);
        bookRepository.save(noEJB);
    }
}
