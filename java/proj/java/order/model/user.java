package proj.java.order.model;

import java.io.Serializable;

public class user implements Serializable {
	
	  private static final long serialVersionUID = 1L;
	   private String firstName;
	   private String lastName;
	   private String bookey;
	   private String delivery;
	   private String address;
	   private String contact;
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
	public String getBookey() {
		return bookey;
	}
	public void setBookey(String bookey) {
		this.bookey = bookey;
	}
	public String getDelivery() {
		return delivery;
	}
	public void setDelivery(String delivery) {
		this.delivery = delivery;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	
}
