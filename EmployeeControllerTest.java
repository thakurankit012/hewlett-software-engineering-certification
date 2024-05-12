package com.example.restservice;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class EmployeeControllerTest {

    @Test
    void getAllEmployeesTest() {
        EmployeeManager mockEmployeeManager = mock(EmployeeManager.class);
        EmployeeController employeeController = new EmployeeController(mockEmployeeManager);

        Employees mockEmployees = new Employees();
        when(mockEmployeeManager.getEmployees()).thenReturn(mockEmployees);

        Employees result = employeeController.getAllEmployees();

        assertEquals(mockEmployees, result);
    }

    @Test
    void addEmployeeTest() {
        EmployeeManager mockEmployeeManager = mock(EmployeeManager.class);
        EmployeeController employeeController = new EmployeeController(mockEmployeeManager);

        Employee employee = new Employee("1", "John", "Doe", "john.doe@example.com", "Developer");

        String result = employeeController.addEmployee(employee);

        verify(mockEmployeeManager).addEmployee(employee);
        assertEquals("Employee added successfully!", result);
    }
}
