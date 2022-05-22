package org.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.hibernate.Hibernateuility;
import orms.Book;

public class Bookdao {
	private SessionFactory sessionFactory = Hibernateuility.getsessionFactory();

	@SuppressWarnings("deprecation")
	public List<Book> findall() {

		Session session = null;
		Transaction transcation = null;

		List<Book> bookList = null;

		session = sessionFactory.openSession();

		transcation = session.beginTransaction();

		Query q = session.createQuery("from Book ");
		bookList = q.list();
		transcation.commit();

		return bookList;

	}

	public void addBook(Book book) {

		Session session = null;
		Transaction transcation = null;

		session = sessionFactory.openSession();

		transcation = session.beginTransaction();
		
		session.save(book);
		
		transcation.commit();

	}
	
	public void deleteBook(Book book) {

		Session session = null;
		Transaction transcation = null;

		session = sessionFactory.openSession();

		transcation = session.beginTransaction();
		
		session.delete(book);
		
		transcation.commit();

	}
	public void updateBook(Book book) {

		Session session = null;
		Transaction transcation = null;

		session = sessionFactory.openSession();

		transcation = session.beginTransaction();
		
		session.update(book);
		
		transcation.commit();

	}



}
