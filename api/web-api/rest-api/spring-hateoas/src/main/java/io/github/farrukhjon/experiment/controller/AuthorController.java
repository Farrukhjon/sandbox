package io.github.farrukhjon.experiment.controller;

import io.github.farrukhjon.experiment.domain.model.Author;
import io.github.farrukhjon.experiment.domain.resource.AuthorResource;
import io.github.farrukhjon.experiment.repository.AuthorRepository;
import org.springframework.hateoas.ExposesResourceFor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/authors")
@ExposesResourceFor(Author.class)
public class AuthorController {

    private final AuthorRepository authorRepository;

    public AuthorController(final AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @RequestMapping("/{id}")
    public ResponseEntity<AuthorResource> getAuthorById(@PathVariable String id) {
        Author author = authorRepository.findOne(id);
        AuthorResource authorResource = new AuthorResource();
        authorResource.setAuthor(author);
        return ResponseEntity.ok(authorResource);
    }

}
