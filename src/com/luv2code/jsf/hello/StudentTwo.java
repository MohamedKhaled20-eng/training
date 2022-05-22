package com.luv2code.jsf.hello;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class StudentTwo {

	private String firstName;
	private String lastName;
	private String Country;
	private List<String> countryOptions;
	private String favoriteLanguage;

	public StudentTwo() {

		// populate the list of countries

		firstName = "Mohamed ";
		lastName = "Ahmed";
		favoriteLanguage = "Ruby";
		
		countryOptions = new ArrayList<>();
		countryOptions.add("Brazil");
		countryOptions.add("Egypt");
		countryOptions.add("Germany");
		countryOptions.add("Usa");
		countryOptions.add("ksa");

	}

	

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public List<String> getCountryOptions() {
		return countryOptions;
	}

	public void setCountryOptions(List<String> countryOptions) {
		this.countryOptions = countryOptions;
	}

	public StudentTwo(String firstName, String lastName, String country, List<String> countryOptions,
			String favoriteLanguage, String[] favoriteProgrammingLanguage) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		Country = country;
		this.countryOptions = countryOptions;
		this.favoriteLanguage = favoriteLanguage;

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

}
