package com.vits.entity;

import java.math.BigDecimal;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int seat_count;
    private Car()
    {
    	
    }
    @Override
	public String toString() {
		return "Car [id=" + id + ", seat_count=" + seat_count + ", make=" + make + ", model=" + model + ", year=" + year
				+ ", registrationNumber=" + registrationNumber + ", dailyRentalRate=" + dailyRentalRate + ", available="
				+ available + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getSeat_count() {
		return seat_count;
	}

	public void setSeat_count(int seat_count) {
		this.seat_count = seat_count;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public BigDecimal getDailyRentalRate() {
		return dailyRentalRate;
	}

	public void setDailyRentalRate(BigDecimal dailyRentalRate) {
		this.dailyRentalRate = dailyRentalRate;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public Set<Rental> getRentals() {
		return rentals;
	}

	public void setRentals(Set<Rental> rentals) {
		this.rentals = rentals;
	}

	private String make;
    private String model;
    private int year;
    private String registrationNumber;
    private BigDecimal dailyRentalRate;
    private boolean available;

    @OneToMany(mappedBy = "car")
    private Set<Rental> rentals;
}
