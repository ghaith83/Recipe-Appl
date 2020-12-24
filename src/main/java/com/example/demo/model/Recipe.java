package com.example.demo.model;


import java.time.LocalTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;

@Entity
public class Recipe {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;

private String Description;

private LocalTime PreTime;

private LocalTime CoockTime;

@Enumerated
private Difficulte diffuclte;

@Lob
private Integer serving;
@OneToMany(mappedBy = "recipe")
List<Ingredient> ingredients;

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

public LocalTime getPreTime() {
	return PreTime;
}

public void setPreTime(LocalTime preTime) {
	PreTime = preTime;
}

public LocalTime getCoockTime() {
	return CoockTime;
}

public void setCoockTime(LocalTime coockTime) {
	CoockTime = coockTime;
}

public Integer getServing() {
	return serving;
}

public void setServing(Integer serving) {
	this.serving = serving;
}

public List<Ingredient> getIngredients() {
	return ingredients;
}

public void setIngredients(List<Ingredient> ingredients) {
	this.ingredients = ingredients;
}




}
