package com.example;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
        name = "bankServlet",
        urlPatterns = {"/bank"}
)
public class bankServlet extends HttpServlet{
	
	bankService employeeService = new bankService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("searchAction");
        if (action!=null){
            switch (action) {                   
            case "searchByName":
            	searchBankByName(req, resp);
                break;
            }
        }else{
            List<loanBank> result = employeeService.getAllEmployees();
            forwardListBanks(req, resp, result);
        }
    }

    
    
    private void searchBankByName(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String employeeName = req.getParameter("employeeName");
        List<loanBank> result = employeeService.searchBanksByName(employeeName);        
        forwardListBanks(req, resp, result);
    }

    private void forwardListBanks(HttpServletRequest req, HttpServletResponse resp, List employeeList)
            throws ServletException, IOException {
        String nextJSP = "/jsp/list-employees.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
        req.setAttribute("employeeList", employeeList);
        dispatcher.forward(req, resp);
    }   

}
