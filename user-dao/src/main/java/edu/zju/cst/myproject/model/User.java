package edu.zju.cst.myproject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	private int id;
	private String name;
	private String address;
	
	public User(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public User(String name, String address) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.address = address;
	}
	public User() {
		// TODO Auto-generated constructor stub
	}
	public String sayHello(String guestName){
		return "Hello "+ guestName;
		}
	
	
	@Id
	@GeneratedValue
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
	
}