package io.github.farrukhjon.experiment.java.collections.linkedlist;

import io.github.farrukhjon.experiment.java.model.Book;

import java.util.LinkedList;

public class LinkedListBasicDemo {

	public static void main(String[] args) {

		LinkedList<Book> listBook = new LinkedList<>();

		listBook.offer(new Book("Java"));
		listBook.offer(new Book("CSS"));
		listBook.offer(new Book("Spring framework"));
		listBook.offer(new Book("HTML"));
		listBook.offerFirst(new Book("MySQL"));

		System.out.println(listBook.contains(new Book("Java")));
		System.out.println(listBook.contains(new Book("PHP")));

		System.out.println(listBook);

	}

}
