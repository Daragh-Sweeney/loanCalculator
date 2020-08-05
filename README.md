# loanCalculator
A simple app that uses Maven, Spring MVC, Java, Hibernate, MySQL to make a web page that will display and calculate some customer data 

If you would like to use this app then you will need to make a few changes.

1. in the Properties file make sure you are using the details for your MySQL server

2. Create a new WAR file by running the command Maven clean install in the base directory,WAR file will be located in the target directory

3. After creating a war file you will need to update it to a server, I used a local tomcat server and directly uploaded my WAR file 

4. When app is running go to the URL http://localhost:8080/tester-0.0.1-SNAPSHOT/customer/list (depending on where you are hosting) to see application
