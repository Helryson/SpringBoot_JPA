package com.educandoweb.course.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity //anotação JPA
@Table(name = "tb_order")
public class Order implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id //anotação JPA
	@GeneratedValue(strategy = GenerationType.IDENTITY) //anotação JPA
	private Long id;
	private Instant moment;
	
	@ManyToOne //indica que o relacionamento entre as entidades é de muitos para um, ou seja, muitas instâncias da entidade que 
	//contém essa anotação estão relacionadas a uma instância de outra entidade.
	@JoinColumn(name = "client_id") //especifica que a coluna client_id na tabela da entidade que contém este campo será usada como
	//a chave estrangeira para armazenar o identificador do cliente.
	private User client;
	
	public Order() {
		
	}

	public Order(Long id, Instant moment, User client) {
		super();
		this.id = id;
		this.moment = moment;
		this.client = client;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}

	public User getClient() {
		return client;
	}

	public void setClient(User client) {
		this.client = client;
	}

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
		Order other = (Order) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
}
