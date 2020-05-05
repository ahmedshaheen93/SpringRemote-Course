package com.shaheen.model;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement
public class User implements Serializable {
    private String name;
    private Double salary;
    private Double bounce;
    private Double deduction;

    public User() {
    }

    public User(String name, Double salary, Double bounce, Double deduction) {
        this.name = name;
        this.salary = salary;
        this.bounce = bounce;
        this.deduction = deduction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Double getBounce() {
        return bounce;
    }

    public void setBounce(Double bounce) {
        this.bounce = bounce;
    }

    public Double getDeduction() {
        return deduction;
    }

    public void setDeduction(Double deduction) {
        this.deduction = deduction;
    }
}
