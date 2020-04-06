package io.sunju.learning.springboot.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import io.sunju.learning.springboot.domain.Book;
import io.sunju.learning.springboot.domain.BookRepository;


@Service
@Transactional
public class BookServiceImpl implements BookService {

	private final BookRepository bookRepository;
	
	
	public BookServiceImpl(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}


	@Override
	public Optional<Book> findById(Long Id) {
		// TODO Auto-generated method stub
		return bookRepository.findById(Id);
		
	}

}
