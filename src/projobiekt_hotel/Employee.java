/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projobiekt_hotel;

/**
 *
 * @author Bieron
 */



public class Employee {
       
    public enum EmployeeType {
        NORMAL,RECEPTIONIST,ADMINISTRATOR
    }
    
    public Employee(EmployeeType employeeType,String email,String password) {
        this.employeeType = employeeType;
        this.email = email;
        this.password = password;
    }
    
    private EmployeeType employeeType;
    private String email;
    private String password;
}
