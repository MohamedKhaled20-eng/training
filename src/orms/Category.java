package orms;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity

@Table(name = "Category")
public class Category {

	private String category_Name;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int category_Id;

	@OneToMany(mappedBy = "category" , cascade = CascadeType.ALL , fetch = FetchType.EAGER ) 
	private List <Book> book;

	public Category(String category_Name, int category_Id, List<Book> book) {
		super();
		this.category_Name = category_Name;
		this.category_Id = category_Id;
		this.book = book;
	}

	public Category() {
		super();
	}

	public String getCategory_Name() {
		return category_Name;
	}

	public void setCategory_Name(String category_Name) {
		this.category_Name = category_Name;
	}

	public int getCategory_Id() {
		return category_Id;
	}

	public void setCategory_Id(int category_Id) {
		this.category_Id = category_Id;
	}

	public List<Book> getBook() {
		return book;
	}

	public void setBook(List<Book> book) {
		this.book = book;
	}
	
	

}
