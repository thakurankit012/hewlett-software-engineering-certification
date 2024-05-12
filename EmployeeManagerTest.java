package com.example.restservice;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeManagerTest {

    private EmployeeManager employeeManager;

    @BeforeEach
    public void setUp() {
        employeeManager = new EmployeeManager();
    }

    @Test
    public void testAddEmployee() {

        Employee employee = new Employee("521", "John", "Doe", "john.doe@example.com", "Developer");


        employeeManager.addEmployee(employee);

        Employees employees = employeeManager.getEmployees();
        List<Employee> employeeList = employees.getEmployeeList();


    }
}