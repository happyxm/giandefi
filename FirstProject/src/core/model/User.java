package core.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Model class che rappresenta un utente
 * @author Gianluca De Filippis
 *
 */
@Entity @Table(name="USERS")
public class User {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;
	
	@Column(name="USER_ID")
	private String userId; 
	
	@Column(name="PASSWORD")
	private String password;
	
	@Column(name="FIRSTNAME")
	private String name;
	
	@Column(name="LASTNAME")
	private String surname;
	
	@Temporal(value = TemporalType.TIMESTAMP)
	@Column(name="JOINED")
	private Date joinDate;
	
	@Column(name="EMAIL")
	private String email;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	@PrePersist
	public void setJoinDate(Date joinDate) {
		this.joinDate = new Date(); 
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return super.toString() + "id=" + id + " userId=" + userId + " password=" + password;
	}
	

}
