package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    @Test
    public void punchOut_shouldAddHoursWorked() {
        //arrange
        Employee employee = new Employee(2, "Alex", "Finance", 18.0, 0.0);

        //act
        employee.punchIn(8.0);   // 8:00 AM
        employee.punchOut(10.0); // 10:00 AM

        //assert
        // Verify that the hours worked are correctly calculated after punching in and out.
        // We expect the employee to have worked 2 hours between punch in and punch out.
        assertEquals(2.0, employee.getHoursWorked());
    }
    @Test
    public void punchIn_shouldRecordStartTime() {
        // Arrange
        Employee employee = new Employee(2, "Jane", "Marketing", 18.0, 0.0);

        // Act
        employee.punchIn(8.0);   // 8:00 AM

        // Assert
        // Verify that the punchIn method correctly records the start time.
        // We expect the punch in time to be 8.0 hours (8:00 AM).
        assertEquals(8.0, employee.getStartTime());
    }

}