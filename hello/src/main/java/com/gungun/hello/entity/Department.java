package com.gungun.hello.entity;


import org.hibernate.validator.constraints.NotBlank;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long departmentID;

    @NotBlank(message = "Please Add Department Name")
    // @Length(max=5, min =1)
    // @Size(max =10, min=0)
    // @Email
    // @Future
    // @Past
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;
    public long getDepartmentID() {
        return departmentID;
    }
    public void setDepartmentID(long departmentID) {
        this.departmentID = departmentID;
    }
    public String getDepartmentName() {
        return departmentName;
    }
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
    public String getDepartmentAddress() {
        return departmentAddress;
    }
    public void setDepartmentAddress(String departmentAddress) {
        this.departmentAddress = departmentAddress;
    }
    public String getDepartmentCode() {
        return departmentCode;
    }
    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }
    public Department() {
    }
    public Department(long departmentID, String departmentName, String departmentAddress, String departmentCode) {
        this.departmentID = departmentID;
        this.departmentName = departmentName;
        this.departmentAddress = departmentAddress;
        this.departmentCode = departmentCode;
    }
    
}
