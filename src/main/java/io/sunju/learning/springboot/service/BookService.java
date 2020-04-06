package io.sunju.learning.springboot.service;

import java.util.Optional;

import io.sunju.learning.springboot.domain.Book;

public interface BookService {

	
	
	Optional<Book>   findById(Long Id);
	
}
