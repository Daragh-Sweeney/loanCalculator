package com.example;

import java.util.ArrayList;
import java.util.List;

public class bankList {

	
	private static final ArrayList<loanBank> employeeList = new ArrayList<loanBank>();
	
	public bankList(){
    }
    
    static{
        employeeList.add(new loanBank("AIB",3.6));
        employeeList.add(new loanBank("royalBank",4.6));
        employeeList.add(new loanBank("BankOfIreland",8.6));	
        employeeList.add(new loanBank("commonWealth",5.3));

        }
    
    public static List<loanBank> getInstance(){
        return employeeList;
    }
}

