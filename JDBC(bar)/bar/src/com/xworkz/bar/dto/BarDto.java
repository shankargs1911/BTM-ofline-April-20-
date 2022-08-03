package com.xworkz.bar.dto;

import java.io.Serializable;

import com.xworkz.bar.constants.Bartype;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor

public class BarDto implements Serializable{
	private Integer id;
	private String name;
	private String location;
	private Bartype type = Bartype.DEFAULT;
	private Double avgcollectionPerDay;
	private Double CollectionPerMonth;
}
