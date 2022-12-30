package io.github.farrukhjon.experiment.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Book {

    private String id;

    private String name;

    private List<Author> authors;

}
