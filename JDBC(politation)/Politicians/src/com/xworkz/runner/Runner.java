package com.xworkz.runner;

import com.xworkz.constant.PartyName;
import com.xworkz.constant.PartySymbol;
import com.xworkz.dao.PoliticianDAO;
import com.xworkz.dao.PoliticianDAOImpl;
import com.xworkz.dto.PoliticianDTO;

public class Runner {

	public static void main(String[] args) {
		PoliticianDTO politicianDTO = new PoliticianDTO(1,"SHANKAR",PartyName.BJP,"Prathiba",3000,1000000.00D,PartySymbol.LOTUS,"Banglore","Delhi");
		PoliticianDTO politicianDTO1 = new PoliticianDTO(2,"ARPITHA",PartyName.PRKY,"Suhas",308,2000000.00D,PartySymbol.FAN,"Banglore","Delhi");
		PoliticianDTO politicianDTO2= new PoliticianDTO(3,"RAMESH",PartyName.RSS,"AmirShah",2000,3000000.00D,PartySymbol.CYCLE,"Banglore","Delhi");
		PoliticianDTO politicianDTO3 = new PoliticianDTO(4,"SUHAS",PartyName.SS,"Yogi",457,4000000.00D,PartySymbol.MOP,"Banglore","Delhi");
		PoliticianDTO politicianDTO4 = new PoliticianDTO(5,"SANJU",PartyName.SP,"DK",200,5000000.00D,PartySymbol.FOX,"Banglore","Delhi");
		PoliticianDTO politicianDTO5 = new PoliticianDTO(6,"LAKSHMI",PartyName.SIV,"Sidu",400,500000.00D,PartySymbol.COCONUT,"Banglore","Delhi");
		PoliticianDTO politicianDTO6 = new PoliticianDTO(7,"SHWETHA",PartyName.KYLP,"Pabu",325,8000000.00D,PartySymbol.CLOCK,"Banglore","Delhi");
		PoliticianDTO politicianDTO7 = new PoliticianDTO(8,"RANJITHA",PartyName.KJP,"Raby",30,200000.00D,PartySymbol.ELEPHANT,"Banglore","Delhi");
		PoliticianDTO politicianDTO8 = new PoliticianDTO(9,"TUKARAM",PartyName.CONG,"Apaji",353,200000.00D,PartySymbol.PAM,"Banglore","Delhi");
		PoliticianDTO politicianDTO9 = new PoliticianDTO(10,"HANUMANTH",PartyName.AAP,"Kumar",210,9000000.00D,PartySymbol.BAG,"Banglore","Delhi");
		
		PoliticianDAO politicianDAO = new PoliticianDAOImpl();
	}

}
