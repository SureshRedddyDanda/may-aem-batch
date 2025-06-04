package com.adobe.aem.may.batch.core.services;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name="EmployeeConfiguration")

public @interface EmployeeConfiguration {

    @AttributeDefinition
            (name = "EmployeeName",
            description = "Suresh is an employee",
                    required = true,
                    defaultValue = "Suresh"
            )
    public String name();
    @AttributeDefinition
            (name = "Employeeid",
                    description = "Employee id",
                    required = true,
                    defaultValue = "77777"
            )
    public int id();
    @AttributeDefinition
            (name = "Employeesalary",
                    description = "Employee salary",
                    required = true,
                    defaultValue = "70000"
            )
    public double salary();
}


