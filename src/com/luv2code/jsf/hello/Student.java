package com.luv2code.jsf.hello;

import java.io.Serializable;
// or import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedBean;
// or import javax.faces.bean.SessionScoped;

@ManagedBean(name = "user")
@javax.faces.bean.SessionScoped
public class Student implements Serializable {
	private String name;
	private String lName;

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	private String password;

	public String getName() {
		return name;
	}

	public void setName(String newValue) {
		name = newValue;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String newValue) {
		password = newValue;
	}
}
