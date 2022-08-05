package com.xworkz.dto;

import com.xworkz.constant.PartyName;
import com.xworkz.constant.PartySymbol;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class  PoliticianDTO {
	private Integer id;
	private String name;
	private PartyName partyName = PartyName.BJP;
	private String president;
	private Integer totalMembers;
	private Double totalBudget;
	private PartySymbol partySymbol = PartySymbol.LOTUS;
	private String location;
	private String headQuaters;		
}
