package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class AdminUser extends User implements HIPAACompliantUser, HIPAACompliantAdmin {
	private Integer employeeID;
    private String role;
    private ArrayList<String> securityIncidents;
    
    // TO DO: Implement a constructor that takes an ID and a role
    public AdminUser(Integer id, String role) {
        this.employeeID = id;
        this.role = role;
        this.securityIncidents = new ArrayList<>();
    }
    // TO DO: Implement HIPAACompliantUser!
    @Override
    public boolean assignPin(int pin) {
        if (String.format("%d", pin).length() == 4) {
            this.pin = pin;
            return true;
        }
        System.out.println("Invalid pin");
        return false;
    }

    @Override
    public boolean accessAuthorized(Integer confirmedAuthID) {
        return Objects.equals(confirmedAuthID, this.id);
    }
    
    // TO DO: Implement HIPAACompliantAdmin!
    @Override
    public ArrayList<String> reportSecurityIncidents() {
        return securityIncidents;
    }

    @Override
    public void printSecurityIncidents() {
        System.out.println(reportSecurityIncidents());
    }

    @Override
    public boolean adminQATest(ArrayList<String> expectedIncidents) {
        if (reportSecurityIncidents().equals(expectedIncidents)) {
            System.out.println("PASS");
        }
        else {
            System.out.println("FAIL");
        }
        return reportSecurityIncidents().equals(expectedIncidents);
    }
    
    public void newIncident(String notes) {
        String report = String.format(
            "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
            new Date(), this.id, notes
        );
        securityIncidents.add(report);
    }

    public void authIncident() {
        String report = String.format(
            "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
            new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
        );
        securityIncidents.add(report);
    }
    
    // TO DO: Setters & Getters
    public Integer getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(Integer employeeID) {
        this.employeeID = employeeID;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        if (role.equals("Admin") || role.equals("Doctor") || role.equals("Nurse")) {
            this.role = role;
        }
        else {
            System.out.println("Invalid role");
        }
    }

    public ArrayList<String> getSecurityIncidents() {
        return securityIncidents;
    }

    public void setSecurityIncidents(ArrayList<String> securityIncidents) {
        this.securityIncidents = securityIncidents;
    }
}
