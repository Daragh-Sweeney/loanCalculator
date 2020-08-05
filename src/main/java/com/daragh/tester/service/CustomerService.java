package com.daragh.tester.service;

import java.util.List;

import com.daragh.tester.entity.loanCust;

public interface CustomerService {

    public List < loanCust > getCustomers();

    public void saveCustomer(loanCust theCustomer);

    public loanCust getCustomer(int theId);

    public void deleteCustomer(int theId);

}