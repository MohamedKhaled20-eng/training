package org.hibernate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

import orms.Book;
import orms.Category;

public class Hibernateuility {

	private static final SessionFactory sessionFactory;

	static {
		try {
			sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

		} catch (Exception e) {
			System.err.print(e);
			throw new ExceptionInInitializerError(e);

		}

	}

	public static SessionFactory getsessionFactory() {

		return sessionFactory;

	}

}
