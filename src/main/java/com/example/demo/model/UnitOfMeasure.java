package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UnitOfMeasure {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;

private String Description;

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


}
