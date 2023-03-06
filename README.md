# OOPS Assignment: Payroll System 
# Installation Guide Spring Tool Suite

**Clone Repository anywhere you want using this Command**

```
git clone https://github.com/yankit293/oops_assignment.git
```
Once cloned or Downloaded 
- Open STS 
- Click on File
- Select Open projects from File System
- Navigate to Dir where you cloned source code.
- Select src Folder 
- Done.

# Objective 
Use Object Oriented Programming (OOP) in Java to create a Payroll system. This assignment 
will focus on: 
 
1. Configuring and creating custom classes objects 
2. Data encapsulation 
3. Data hiding  
4. Exception handling 
 
**Software Requirements**
1. Java 8 
2. Eclipse IDE 
 
**Details**
Create a payroll system that calculates the hourly, bi-weekly, and monthly compensation wages 
for  temporary,  contract,  and  full-time  employees  and  report  the  total  wage  value  before  and 
after taxes. 
  
**You must consider the following:**  
- Temporary employees: hourly wage only, no benefits, income taxed at 15%. 
- Contract employees: bi-weekly wage only, no benefits, income taxed at 18%. 
- Fulltime  employees:  monthly  wage  only,  benefits  deducted  at  10%,  income  taxed  at 
20%.  
 
Create a payroll system using Java with at least two classes: Payroll.java and Employee.java. 
You can add more classes if you think it is necessary. The application is executed by command 
line only. (No need for GUI or web application forms.)  
 
You must add comments to all the classes and methods.  
 
Employee.java technical details: 
 
**Constructor’s parameters:**  
- Employee’s Name, Employee ID, Work Type (T, C, F), Wage  
 
 **Instance variables:** 
- Employee Name - String 
- Employee ID - int 
- Work Type - char 
- Wage - double 
 
**Methods:** 
- Use  setter  and  getter  methods  to  manipulate  the  values  inputted.  For  methods,  use 
JavaBeans recommendations to name getter and setter methods. For e.g.: If the field is 
“name”, then getter method should be named “getName()”. 
 
 
**Payroll.java technical details:** 
 
- You can use a data structure such as an Array/ArrayList to store employee information. 
- The program should continue to execute unless the user inputs ‘N’ to the question “Do 
you want to register another employee (Y/N)?” 
- The system must ask and validate the inputs for the command line values inputted:  
 
 
# Expected Output 
 
Option ‘Y’:  
 
Please enter the employee’s name? ____  
Please enter the employee’s ID? ____  
Please enter the employee’s work type? ____  
Please enter the employee’s wage? ____  
Employee’s wage after tax: #  
**********************************************  
Then the program will loop back and ask, ‘Do you want to register another employee (Y/N)?’ 
It will only exit the loop if input is N.  
 
Option ‘N’:  
 
When the user inputs N, the following is displayed:  
 
Employee name, employee ID, Work Type, Total Wage before tax, Total Wage after tax  
1. John Doe, 234354, C, $4500.00, $3690.00  
2. Ella Jones, 045644, F, $5500.00, $3850.00  
Etc....  
Total employees: #  
Work types: (#) Temporary, (#) Contract, (#) Full-time  
Total wages before tax: #  
Total wages after tax: #  
Exit program. 
 
**Note: To take user inputs use, Scanner library from java.util.Scanner.** 
 
 
 
 
# Validations:  
 
To validate errors and report them in the command prompt, consider the following: 
- The hourly pay cannot exceed 90.00 but can be 0  
- The bi-weekly pay cannot be below 1000.00 or more than 3500.00  
- The monthly pay cannot be less than 3000.00  
- Employee name must have at least one space and cannot be less than 5 characters  
- Employee ID must be a positive integer  
- Pay must be a positive value.
