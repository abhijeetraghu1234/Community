package com.example.a.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
@Table(name="Role")
public class Member {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
public Long Id;
@OneToMany
@JoinColumn(name="Community")
public Community Community;
@JoinColumn(name="User")
public User User;
@JoinColumn(name="Role")
public Role Role;
@Column(nullable=false)
public Long created_at;
public Long getId() {
	return Id;
}
public void setId(Long id) {
	Id = id;
}
public Community getCommunity() {
	return Community;
}
public void setCommunity(Community community) {
	Community = community;
}
public User getUser() {
	return User;
}
public void setUser(User user) {
	User = user;
}
public Role getRole() {
	return Role;
}
public void setRole(Role role) {
	Role = role;
}
public Long getCreated_at() {
	return created_at;
}
public void setCreated_at(Long created_at) {
	this.created_at = created_at;
}

}
