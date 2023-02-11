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
		
		Book book2 = new Book("ISBN1235", "Node.js 교과서", 36000);
		book2.setAuther("조현영");
		book2.setDescription("C# 교과서는 생애 첫 프로그래밍 언어로 C#을 시작하는 독자들을 대상으로 한다. 특히 응용 프로그래머를 위한 C# 입문서로, C#을 사용하여 게임(유니티), 웹, 모바일, IoT 등을 개발할 때 필요한 C# 기초 문법을 익히고 기본기를 탄탄하게 다지는 것이 목적이다");
		book2.setPublisher("길벗");
		book2.setCategory("IT전문서");
		book2.setReleaseDate("2023/07/10");
		
		Book book3 = new Book("ISBN1236", "어도비 XD CC 2020", 25000);
		book3.setAuther("김두한");
		book3.setDescription("C# 교과서는 생애 첫 프로그래밍 언어로 C#을 시작하는 독자들을 대상으로 한다. 특히 응용 프로그래머를 위한 C# 입문서로, C#을 사용하여 게임(유니티), 웹, 모바일, IoT 등을 개발할 때 필요한 C# 기초 문법을 익히고 기본기를 탄탄하게 다지는 것이 목적이다");
		book3.setPublisher("길벗");
		book3.setCategory("IT전문서");
		
		book3.setReleaseDate("2023/02/08");
		
		listOfBooks.add(book);
		listOfBooks.add(book2);
		listOfBooks.add(book3);
	}
	
	@Override
	public List<Book> getAllBookList() {
		return listOfBooks;
	}

}
