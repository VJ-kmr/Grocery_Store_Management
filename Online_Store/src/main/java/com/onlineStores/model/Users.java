package com.onlineStores.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Users {
	
@Id
private String userMail;	
private String userName;
private int userCondact;
private String Password;

public Users() {
	super();
	// TODO Auto-generated constructor stub
}
public Users(String userMail,String userName,int userCondact, String Password) {
	this.userMail=userMail;
	this.userName=userName;
	this.userCondact=userCondact;
	this.Password=Password;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public int getUserCondact() {
	return userCondact;
}
public void setUserCondact(int userCondact) {
	this.userCondact = userCondact;
}
public String getUserMail() {
	return userMail;
}
public void setUserMail(String userMail) {
	this.userMail = userMail;
}
public String getPassword() {
	return Password;
}
public void setPassword(String Password) {
	this.Password = Password;
}
}
