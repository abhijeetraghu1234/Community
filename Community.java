package com.example.a.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name="Community")
public class Community {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
public Long Id;
public String name;
public String slug;
public String owner;
public Long Created_at;
public Long datetime;
public Long getId() {
	return Id;
}
public void setId(Long id) {
	Id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSlug() {
	return slug;
}
public void setSlug(String slug) {
	this.slug = slug;
}
public String getOwner() {
	return owner;
}
public void setOwner(String owner) {
	this.owner = owner;
}
public Long getCreated_at() {
	return Created_at;
}
public void setCreated_at(Long created_at) {
	Created_at = created_at;
}
public Long getDatetime() {
	return datetime;
}
public void setDatetime(Long datetime) {
	this.datetime = datetime;
}

}
