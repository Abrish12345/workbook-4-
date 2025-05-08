package com.pluralsight;

import java.time.LocalDateTime;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private Double startTime;  //Double object to check if set

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }



    public double getRegularHours() {
        return Math.min(40, hoursWorked);
    }
    public double getOvertimeHours (){
        return Math.max(0, hoursWorked -40);
    }
    public double getTotalPay(){
        return (getRegularHours() * payRate) + (getOvertimeHours() * payRate * 1.5);
    }



    public void punchIn(double time){

        this.startTime=time;

    }
    public void punchIn(){
        LocalDateTime dateTime= LocalDateTime.now();
        double currentTime = dateTime.getHour() + dateTime.getMinute() / 60.0;
       this.punchIn(currentTime);
    }
    public void punchOut(double time){
        if(time >= startTime) {
           double worked = time - startTime; //calculate hours worked
            this.hoursWorked +=worked; //add the worked hours to total hoursworked
        }else {
                System.out.println("Invalid time. Punch out time cannot be earlier than punch in.");
            }

        }

        public void punchOut(){
            LocalDateTime dateTime= LocalDateTime.now();
            double currentTime=dateTime.getHour() + dateTime.getMinute() /60.0;
            this.punchOut(currentTime);

        }


    public double getStartTime() { return startTime;
    }
}
