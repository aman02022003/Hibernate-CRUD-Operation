package com.aman;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
    
	  @Id
	  @GeneratedValue(strategy= GenerationType.IDENTITY)
	  private int id;
	  private String name;
	  private String address;
	  
	  @Column(name="collage_name")
	  private String collageName;
	  private String email;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, String address, String collageName, String email) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.collageName = collageName;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCollageName() {
		return collageName;
	}
	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", collageName=" + collageName
				+ ", email=" + email + "]";
	}
	  
	
	  
	  
	
}
