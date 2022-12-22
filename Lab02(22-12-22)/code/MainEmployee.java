/*1) create an employee class with name,id,salary and intialize it using constructor and override toString() method
to print the string representation of employee and an instance method which increments the salary of the employee
and call the method inside another class MainEmployee and increment the salary and display employee information*/
import java.util.*;
class Employee 
{    
    int id;    
    String name;    
    int salary;    
        
    public Employee(int id, String name, int salary) 
	{    
        this.id = id;    
        this.name = name;    
        this.salary = salary;    
    }    
        
    public String toString() 
	{    
        return "Employee id: " +id+"\n"+ "Employee name:  "+name+"\n"+ "Salary: "+ salary;    
    }    
	
}

public class MainEmployee
 {    
    public static void main(String args[]) 
	{    
        Employee e = new Employee(3679, "Naveen", 50000);
        System.out.println(e); 
		

    }    
}