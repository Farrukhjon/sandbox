package io.github.farrukhjon.experiment;

import io.github.farrukhjon.experiment.domain.resource.BookResourceAssemblerSupport;
import io.github.farrukhjon.experiment.repository.AuthorRepository;
import io.github.farrukhjon.experiment.repository.AuthorRepositoryImpl;
import io.github.farrukhjon.experiment.repository.BookRepository;
import io.github.farrukhjon.experiment.repository.InMemoryBookRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.hateoas.EntityLinks;
import org.springframework.hateoas.config.EnableHypermediaSupport;

import static org.springframework.hateoas.config.EnableHypermediaSupport.HypermediaType.HAL;

@SpringBootApplication
@EnableHypermediaSupport(type = HAL)
public class Application {

    @Bean
    public BookResourceAssemblerSupport bookResourceAssembler(final EntityLinks entityLinks) {
        return new BookResourceAssemblerSupport(entityLinks);
    }

    @Bean
    public BookRepository bookRepository() {
        return new InMemoryBookRepository();
    }

    @Bean
    public AuthorRepository authorRepository(final BookRepository bookRepository) {
        return new AuthorRepositoryImpl(bookRepository);
    }

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
