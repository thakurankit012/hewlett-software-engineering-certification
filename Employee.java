package com.example.restservice;

public class Employee {

	private final String employee_id;
    private final String first_name;
    private final String last_name;
    private final String email;
    private final String title;

    public Employee(String employee_id,
                    String first_name,
                    String last_name,
                    String email,
                    String title)
    {
        this.employee_id = employee_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.title = title;
    }

    @Override
    public String toString()
    {
  
        return "Employee: ID = "
            + employee_id + ", First Name = "
            + first_name + ", Last Name = "
            + last_name + ", email = "
            + email + ", title = "
            + title;      
    }

    public String getId()
    {
        return employee_id;
    }

    public String getFirstName()
    {
        return first_name;
    }

    public String getLastName()
    {
        return last_name;
    }

    public String getEmail()
    {
        return email;
    }

    public String getTitle()
    {
        return title;
    }

}