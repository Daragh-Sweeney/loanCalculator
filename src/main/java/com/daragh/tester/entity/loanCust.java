package com.daragh.tester.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//access the database with the table loancust
@Entity
@Table(name = "loancust")
public class loanCust {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;
    
    @Column(name = "interest")
    private Double interest;
    
    @Column(name = "years")
    private int years;
    
    @Column(name = "amount")
    private Double amount;

    public loanCust() {}
    
    
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    
    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}
    
    public Double getInterest() {return interest;}
    public void setInterest(Double interest) {this.interest = interest;}
    
    public int getYears() {return years;}
    public void setYears(int years) {this.years = years;}
    
    public Double getAmount() {return amount;}
    public void setAmount(Double amount) {this.amount = amount;}
    
    @Override
    public String toString() {
        return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", interest=" + interest + ", years=" + years +", amount=" + amount + "]";
    }

}
