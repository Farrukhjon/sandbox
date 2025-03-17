package io.github.farrukhjon.experiment.java.optionalfilter;

import java.util.Optional;

public class Book {

    private String isbn;

    public Optional<String> getIsbn() {
        return Optional.ofNullable(isbn);
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
