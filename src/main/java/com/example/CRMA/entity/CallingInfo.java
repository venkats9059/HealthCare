package com.example.CRMA.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "callinginfo")
public class CallingInfo {
	@Id
	@GeneratedValue
	private Integer id;
	private String purpose;
	private String description;
	private Date    callingDateTime;
	
	public Date getCallingDateTime() {
		return callingDateTime;
	}

	public void setCallingDateTime(Date callingDateTime) {
		this.callingDateTime = callingDateTime;
	}

	@ManyToOne
	@JoinColumn(name="eid")
	private Employee employee;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@ManyToOne
	@JoinColumn(name = "cid")
	private Customer customer;
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
