package com.cg.finalproject.beans;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Orders {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int orderId;
	@OneToMany(mappedBy="order",cascade=CascadeType.ALL)
	private List<Product> products = new ArrayList<Product>();// one to many
	private int userId;
	private double totalAmount;
	private String deliveryStatus;// placed, shipped, out for delivery 
	private String statusOfTransaction; //Success or fail
	private String modeOfPurchase;// can be COD, Online Purchase
	@OneToMany(mappedBy="order",cascade=CascadeType.ALL)
	private List<Merchant> merchant = new ArrayList<Merchant>();// one to many
	private Date elligibleReturnDate;
	private Date orderPlacedOn;
	private boolean refundRequest;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="phoneNumber")
	private Customer customer;//one to one
	
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getDeliveryStatus() {
		return deliveryStatus;
	}
	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}
	public String getStatusOfTransaction() {
		return statusOfTransaction;
	}
	public void setStatusOfTransaction(String statusOfTransaction) {
		this.statusOfTransaction = statusOfTransaction;
	}
	public String getModeOfPurchase() {
		return modeOfPurchase;
	}
	public void setModeOfPurchase(String modeOfPurchase) {
		this.modeOfPurchase = modeOfPurchase;
	}
	public List<Merchant> getMerchant() {
		return merchant;
	}
	public void setMerchant(List<Merchant> merchant) {
		this.merchant = merchant;
	}
	public Date getElligibleReturnDate() {
		return elligibleReturnDate;
	}
	public void setElligibleReturnDate(Date elligibleReturnDate) {
		this.elligibleReturnDate = elligibleReturnDate;
	}
	public Date getOrderPlacedOn() {
		return orderPlacedOn;
	}
	public void setOrderPlacedOn(Date orderPlacedOn) {
		this.orderPlacedOn = orderPlacedOn;
	}
	public boolean isRefundRequest() {
		return refundRequest;
	}
	public void setRefundRequest(boolean refundRequest) {
		this.refundRequest = refundRequest;
	}
	
	
	
}
