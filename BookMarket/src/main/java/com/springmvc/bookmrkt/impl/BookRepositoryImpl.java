package com.springmvc.bookmrkt.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.springmvc.bookmrkt.Book;
import com.springmvc.bookmrkt.BookRepository;

@Repository
public class BookRepositoryImpl implements BookRepository {

	private List<Book> listOfBooks = new ArrayList<Book>();
	public BookRepositoryImpl() {
		
		Book book = new Book("ISBN1234", "C# 교과서", 30000);
		book.setAuther("박용준");
		book.setDescription("C# 교과서는 생애 첫 프로그래밍 언어로 C#을 시작하는 독자들을 대상으로 한다. 특히 응용 프로그래머를 위한 C# 입문서로, C#을 사용하여 게임(유니티), 웹, 모바일, IoT 등을 개발할 때 필요한 C# 기초 문법을 익히고 기본기를 탄탄하게 다지는 것이 목적이다");
		book.setPublisher("길벗");
		book.setCategory("IT전문서");
		book.setReleaseDate("2023/02/08");
		
		listOfBooks.add(book);
	}
	@Override
	public List<Book> getAllBookList() {
		return listOfBooks;
	}

}
