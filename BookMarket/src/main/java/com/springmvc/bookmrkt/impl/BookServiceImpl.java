package com.springmvc.bookmrkt.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.bookmrkt.Book;
import com.springmvc.bookmrkt.BookRepository;
import com.springmvc.bookmrkt.BookService;

@Service
public class BookServiceImpl implements BookService {
	@Autowired
	private BookRepository bookRepository;
	
	@Override
	public List<Book> getAllBookList() {
		return bookRepository.getAllBookList();
	}

}
