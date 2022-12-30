package io.github.farrukhjon.experiment.controller;

import io.github.farrukhjon.experiment.domain.model.Author;
import io.github.farrukhjon.experiment.domain.model.Book;
import io.github.farrukhjon.experiment.domain.resource.AuthorResource;
import io.github.farrukhjon.experiment.domain.resource.BookResource;
import io.github.farrukhjon.experiment.domain.resource.BookResourceAssemblerSupport;
import io.github.farrukhjon.experiment.repository.AuthorRepository;
import io.github.farrukhjon.experiment.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.ExposesResourceFor;
import org.springframework.hateoas.Link;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

@RestController
@RequestMapping("/books")
@ExposesResourceFor(Author.class)
public class BookController {

    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;
    private final BookResourceAssemblerSupport bookResourceAssembler;

    @Autowired
    public BookController(final BookRepository bookRepository,
                          final AuthorRepository authorRepository,
                          final BookResourceAssemblerSupport bookResourceAssembler) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
        this.bookResourceAssembler = bookResourceAssembler;
    }

    @RequestMapping
    public ResponseEntity<List<BookResource>> showAllBooks() {
        List<Book> books = this.bookRepository.findAll();
        List<BookResource> bookResources = bookResourceAssembler.toResources(books);
        return ResponseEntity.ok(bookResources);
    }

    @RequestMapping("/{id}")
    public ResponseEntity<BookResource> getBookById(@PathVariable final String id) {
        Book book = this.bookRepository.findOne(id);
        BookResource bookResource = bookResourceAssembler.toResource(book);
        return ResponseEntity.ok(bookResource);
    }

    @RequestMapping("/{id}/{authorId}")
    public ResponseEntity<AuthorResource> getAuthorByBookId(@PathVariable final String id,
                                                        @PathVariable final String authorId) {
        Author authorById = authorRepository.findAuthorByBookId(id, authorId);
        return ResponseEntity.ok(new AuthorResource(authorById));

    }

    @RequestMapping("/{id}/authors")
    public ResponseEntity<List<AuthorResource>> getAuthorsForBook(@PathVariable String id) {
        List<Author> allAuthors = authorRepository.findAllAuthorsByBookId(id);
        List<AuthorResource> authorResources = allAuthors.stream()
                                                         .map(author -> {
                                                             ResponseEntity<AuthorResource> authorById = methodOn(BookController.class)
                                                                     .getAuthorByBookId(id, author.getId());
                                                             Link link = linkTo(authorById).withSelfRel();
                                                             AuthorResource authorResource = new AuthorResource(author);
                                                             authorResource.add(link);
                                                             return authorResource;
                                                         })
                                                         .collect(Collectors.toList());
        return ResponseEntity.ok(authorResources);
    }


}
