package com.bookapp.model.service;
import java.util.List;
import com.bookapp.model.dao.Book;

public interface BookService {
	public List<Book> getAll();
	public void addBook(Book book);
}
