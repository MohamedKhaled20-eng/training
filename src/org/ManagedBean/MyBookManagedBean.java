package org.ManagedBean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.dao.Bookdao;

import orms.Book;

@ManagedBean(name="bookBean")
@ViewScoped
public class MyBookManagedBean {

	public List<Book> finddata() {

		Bookdao bookdao = new Bookdao();
		List<Book> booklist = bookdao.findall();

		return booklist;
	}
	
	public void addbook(Book book) {

		Bookdao bookdao = new Bookdao();
		bookdao.addBook(book);
	}
	
	public void removebook(Book book) {

		Bookdao bookdao = new Bookdao();
		bookdao.deleteBook(book);
	}
	
	
	
	
}
