package com.vits.entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Rental {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "car_id")
    private Car car;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    private LocalDateTime rentalDateTime;
    private LocalDate returnDate;
    private BigDecimal rentalFee;
    public Rental()
    {
    	
    }
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public LocalDateTime getRentalDateTime() {
		return rentalDateTime;
	}
	public void setRentalDateTime(LocalDateTime rentalDateTime) {
		this.rentalDateTime = rentalDateTime;
	}
	public LocalDate getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(LocalDate returnDate) {
		this.returnDate = returnDate;
	}
	public BigDecimal getRentalFee() {
		return rentalFee;
	}
	public void setRentalFee(BigDecimal rentalFee) {
		this.rentalFee = rentalFee;
	}
	@Override
	public String toString() {
		return "Rental [id=" + id + ", car=" + car + ", rentalDateTime=" + rentalDateTime + ", returnDate=" + returnDate
				+ ", rentalFee=" + rentalFee + "]";
	}

}
