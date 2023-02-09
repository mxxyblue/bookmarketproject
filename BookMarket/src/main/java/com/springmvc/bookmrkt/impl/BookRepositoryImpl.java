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
		
		Book book = new Book("ISBN1234", "C# ������", 30000);
		book.setAuther("�ڿ���");
		book.setDescription("C# �������� ���� ù ���α׷��� ���� C#�� �����ϴ� ���ڵ��� ������� �Ѵ�. Ư�� ���� ���α׷��Ӹ� ���� C# �Թ�����, C#�� ����Ͽ� ����(����Ƽ), ��, �����, IoT ���� ������ �� �ʿ��� C# ���� ������ ������ �⺻�⸦ źź�ϰ� ������ ���� �����̴�");
		book.setPublisher("���");
		book.setCategory("IT������");
		book.setReleaseDate("2023/02/08");
		
		listOfBooks.add(book);
	}
	@Override
	public List<Book> getAllBookList() {
		return listOfBooks;
	}

}
