package io.github.farrukhjon.experiment.domain.resource;

import io.github.farrukhjon.experiment.controller.BookController;
import io.github.farrukhjon.experiment.domain.model.Author;
import io.github.farrukhjon.experiment.domain.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityLinks;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

public class BookResourceAssemblerSupport extends ResourceAssemblerSupport<Book, BookResource> {

    private final EntityLinks entityLinks;

    @Autowired
    public BookResourceAssemblerSupport(final EntityLinks entityLinks) {
        super(BookController.class, BookResource.class);
        this.entityLinks = entityLinks;
    }

    @Override
    public BookResource toResource(final Book book) {
        BookResource bookResource = createResourceWithId(book.getId(), book);
        bookResource.setBook(book);
        return bookResource;
    }

}
