package com.example.restservice;

import com.example.restservice.Employees;
import org.springframework.stereotype.Repository;
import java.util.List;

  
@Repository
public class EmployeeManager {
  
    private static Employees list = new Employees();

    // Manually initialize service to contain some employees
    static
    {
        Employee employee1 = new Employee("1", "First1", "Last1", "Email1", "Title1");
        Employee employee2 = new Employee("2", "First2", "Last2", "Email2", "Title2");
        Employee employee3 = new Employee("3", "First3", "Last3", "Email3", "Title3");

        list.getEmployeeList().add(employee1);
        list.getEmployeeList().add(employee2);
        list.getEmployeeList().add(employee3);
    }
  
    public Employees getAllEmployees()
    {
        return list;
    }
  
    public void addEmployee(Employee employee)
    {
        list.getEmployeeList().add(employee);
    }
}
