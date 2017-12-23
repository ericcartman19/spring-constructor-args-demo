package com.valoyes.springdemo;

public class Organization {

	private String companyName;
	
	private int yearOfIncorporation;
	
	
	// Default ctor.
//	public Organization() {
//		
//	}
	
	// Ctor. 2
	public Organization(String companyName, int yearOfIncorporation) {
		super();
		this.companyName = companyName;
		this.yearOfIncorporation = yearOfIncorporation;
	}



	public void comporateSlogan() {
		System.out.println("We build the ultimate driving machines");
	}


	@Override
	public String toString() {
		return "Organization [companyName=" + companyName + ", yearOfIncorporation=" + yearOfIncorporation + "]";
	}
	
	
	
}
