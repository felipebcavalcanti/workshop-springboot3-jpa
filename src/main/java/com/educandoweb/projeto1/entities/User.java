package com.educandoweb.projeto1.entities;

import java.io.Serializable;
import java.util.Objects;
/*Serializable serve para transformar os objetos em cadeias de bytes, para que o objeto */
 /*trafegue na rede, seja convertido em arquivo e assim por diante*/

public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private String number;
	private String email;
	private String password;
	
	public User() {
		
	};

	public User(Long id, String name, String number, String email, String password) {
		super();
		this.id = id;
		this.name = name;
		this.number = number;
		this.email = email;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
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
	/*Hash Code e Equals, é pra comparar um objeto ao outro, sendo assim não podendo duplicar*/
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(id, other.id);
	};
	
	
}
