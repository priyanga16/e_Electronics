package com.eelectronics.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	 private int usersid;
	 
	 private String username;
	 private String password;
	 private boolean enabled;
	public int getUsersid() {
		return usersid;
	}
	public void setUsersid(int usersid) {
		this.usersid = usersid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

}
