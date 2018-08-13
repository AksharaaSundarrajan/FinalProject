package com.cg.finalproject.beans;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Customer {
@Id
private String phoneNumber;
@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name="addressId")
private Address address;	
private String email;
private String password;
private String cardNumber;
private String securityQuestion;
private String securityAnswer;
@OneToMany(mappedBy="customer",cascade=CascadeType.ALL)
private List<Review> reviews = new ArrayList<Review>();// one to many


public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public String getSecurityQuestion() {
	return securityQuestion;
}
public void setSecurityQuestion(String securityQuestion) {
	this.securityQuestion = securityQuestion;
}
public String getSecurityAnswer() {
	return securityAnswer;
}
public void setSecurityAnswer(String securityAnswer) {
	this.securityAnswer = securityAnswer;
}
public String getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getCardNumber() {
	return cardNumber;
}
public void setCardNumber(String cardNumber) {
	this.cardNumber = cardNumber;
}



}
