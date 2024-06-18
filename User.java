package com.example.a.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name="user")
public class User{
@Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
public Long Id;
@Column(nullable=false)
public String name;
@Column(nullable=false)
public String Email;
@Column(nullable=false)
public Integer created_at;
@Column(nullable=false)
public String password;
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
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public Integer getCreated_at() {
	return created_at;
}
public void setCreated_at(Integer created_at) {
	this.created_at = created_at;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}


}
