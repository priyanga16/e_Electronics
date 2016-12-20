package com.eelectronics.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Authorities implements Serializable {
	
	private static final long serialVersionUID = 820518977832071392L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	 private int authoritiesid;
	 
	 private String authority;
	 private String username;
	public int getAuthoritiesid() {
		return authoritiesid;
	}
	public void setAuthoritiesid(int authoritiesid) {
		this.authoritiesid = authoritiesid;
	}
	public String getAuthority() {
		return authority;
	}
	public void setAuthority(String authority) {
		this.authority = authority;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

}
