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
		
		Book book2 = new Book("ISBN1235", "Node.js ������", 36000);
		book2.setAuther("������");
		book2.setDescription("C# �������� ���� ù ���α׷��� ���� C#�� �����ϴ� ���ڵ��� ������� �Ѵ�. Ư�� ���� ���α׷��Ӹ� ���� C# �Թ�����, C#�� ����Ͽ� ����(����Ƽ), ��, �����, IoT ���� ������ �� �ʿ��� C# ���� ������ ������ �⺻�⸦ źź�ϰ� ������ ���� �����̴�");
		book2.setPublisher("���");
		book2.setCategory("IT������");
		book2.setReleaseDate("2023/07/10");
		
		Book book3 = new Book("ISBN1236", "��� XD CC 2020", 25000);
		book3.setAuther("�����");
		book3.setDescription("C# �������� ���� ù ���α׷��� ���� C#�� �����ϴ� ���ڵ��� ������� �Ѵ�. Ư�� ���� ���α׷��Ӹ� ���� C# �Թ�����, C#�� ����Ͽ� ����(����Ƽ), ��, �����, IoT ���� ������ �� �ʿ��� C# ���� ������ ������ �⺻�⸦ źź�ϰ� ������ ���� �����̴�");
		book3.setPublisher("���");
		book3.setCategory("IT������");
		
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
