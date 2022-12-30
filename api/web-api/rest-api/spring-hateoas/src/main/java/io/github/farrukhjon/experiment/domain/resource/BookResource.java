package io.github.farrukhjon.experiment.domain.resource;

import lombok.Data;
import io.github.farrukhjon.experiment.domain.model.Book;
import org.springframework.hateoas.ResourceSupport;

@Data
public class BookResource extends ResourceSupport {

    private Book book;

}
