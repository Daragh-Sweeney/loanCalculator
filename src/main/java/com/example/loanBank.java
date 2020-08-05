package com.example;

public class loanBank {
	
	
	private String name;
	private Double rate;
	
	public loanBank(String name,Double rate) {
		this.setName(name);
		this.setRate(rate);
	}

	public Double getRate() {return rate;}
	public void setRate(Double rate) {this.rate = rate;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
}
