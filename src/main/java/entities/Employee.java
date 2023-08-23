package entities;

import jakarta.persistence.*;

import java.text.DecimalFormat;

@Entity
@Table(name = "employee")
public class Employee extends Person{
    @Column(columnDefinition = "DECIMAL(9,2)")
    private Double salary;
    private String position;

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDptName() {
        return dptName;
    }

    public void setDptName(String dptName) {
        this.dptName = dptName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(length = 30)
    private String dptName;
    @Column(unique = true)
    private String email;


}
