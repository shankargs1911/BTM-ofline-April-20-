package com.xworkz.resort.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "resort_info")
@NoArgsConstructor
public class ResortEntity {

	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "location")
	private String location;

	@Column(name = "checkedintime")
	private LocalTime checkInTime;

	@Column(name = "checkedouttime")
	private LocalTime checkOutTime;

	@Column(name = "createby")
	private String createdBy;

	@Column(name = "createdate")
	private LocalDate createDate;

	@Column(name = "updatedate")
	private LocalDate updateDate;

	@Column(name = "owner")
	private String owner;

	@Column(name = "priceperDay")
	private double pricePerDay;
}
