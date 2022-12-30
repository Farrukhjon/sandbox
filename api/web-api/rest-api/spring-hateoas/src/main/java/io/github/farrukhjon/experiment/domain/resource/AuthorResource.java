package io.github.farrukhjon.experiment.domain.resource;

import lombok.Getter;
import lombok.Setter;
import io.github.farrukhjon.experiment.domain.model.Author;
import org.springframework.hateoas.ResourceSupport;

@Getter
@Setter
public class AuthorResource extends ResourceSupport {

    private Author author;

}
