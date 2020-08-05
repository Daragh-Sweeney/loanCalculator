package com.example;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class bankService {
	bankList b = new bankList();
	List<loanBank> bankList = b.getInstance();
	
	//get all banks
	 public List<loanBank> getAllEmployees() {        
	        return bankList;
	    }
	
	 //get a specific bank by name
	 public List<loanBank> searchBanksByName(String name) {
	        Comparator<loanBank> groupByComparator = Comparator.comparing(loanBank::getName);
	        List<loanBank> result = bankList
	                .stream()
	                .filter(e -> e.getName().equalsIgnoreCase(name))
	                .sorted(groupByComparator)
	                .collect(Collectors.toList());
	        return result;
	    }

}
