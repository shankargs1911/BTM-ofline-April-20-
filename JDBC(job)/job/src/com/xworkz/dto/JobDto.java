package com.xworkz.dto;

import java.io.Serializable;

import com.xworkz.constant.Designation;
import com.xworkz.constant.Qualification;

public class JobDto implements Serializable {

	private int jid;
	private Designation designation;
	private double packagee;
	private Qualification qualification;
	private double percentage;
	private String fresher;

	public JobDto() {
	}

	public int getJid() {
		return jid;
	}

	public void setJid(int jid) {
		this.jid = jid;
	}

	public Designation getDesignation() {
		return designation;
	}

	public void setDesignation(Designation string) {
		this.designation = string;
	}

	public double getPackagee() {
		return packagee;
	}

	public void setPackagee(double packagee) {
		this.packagee = packagee;
	}

	public Qualification getQualification() {
		return qualification;
	}

	public void setQualification(Qualification qualification) {
		this.qualification = qualification;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public String isFresher() {
		return fresher;
	}

	public void setFresher(String fresher) {
		this.fresher = fresher;
	}

	@Override
	public String toString() {
		return super.toString();
	}

}
