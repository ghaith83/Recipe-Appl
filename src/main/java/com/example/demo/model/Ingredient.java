package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Ingredient {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

private String Description;

private double Amount;
@ManyToOne
private Recipe recipe;
@OneToOne
private  UnitOfMeasure um;

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getDescription() {
	return Description;
}

public void setDescription(String description) {
	Description = description;
}

public double getAmount() {
	return Amount;
}

public void setAmount(double amount) {
	Amount = amount;
}

public UnitOfMeasure getUm() {
	return um;
}

public void setUm(UnitOfMeasure um) {
	this.um = um;
}

}
