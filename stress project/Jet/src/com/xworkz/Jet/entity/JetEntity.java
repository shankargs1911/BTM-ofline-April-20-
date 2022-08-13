package com.xworkz.Jet.entity;

import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@Data
@Table(name = "Jet")
@NoArgsConstructor
public class JetEntity {
	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "owner")
	private String owner;
	
	@Column(name = "location")
	private String location;
	
	@Column(name = "createdBy")
	private String createdBy;
	
	@Column(name = "price")
	private double price;

}
