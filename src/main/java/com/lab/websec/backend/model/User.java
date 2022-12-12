package com.lab.websec.backend.model;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private BigInteger id;

	@NotBlank
	private String username;

	@Email
	private String email;

	@NotBlank
	private String password;

	@ElementCollection
	@JoinTable(name = "user_roles", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
	public Set<Role> roles = new HashSet<>();

	public User() {
	  }

	  public User(String username, String email, String password) {
	    this.username = username;
	    this.email = email;
	    this.password = password;
	  }

	  public BigInteger getId() {
	    return id;
	  }

	  public void setId(BigInteger id) {
	    this.id = id;
	  }

	  public String getUsername() {
	    return username;
	  }

	  public void setUsername(String username) {
	    this.username = username;
	  }

	  public String getEmail() {
	    return email;
	  }

	  public void setEmail(String email) {
	    this.email = email;
	  }

	  public String getPassword() {
	    return password;
	  }

	  public void setPassword(String password) {
	    this.password = password;
	  }

	  public Set<Role> getRoles() {
	    return roles;
	  }

	  public void setRoles(Set<Role> roles) {
	    this.roles = roles;
	  }
}
