package com.micro.job.job;

import com.micro.job.companies.Company;
import jakarta.persistence.*;

@Entity
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String tittle;
    private String description;
    private int minsalary;
    private int maxsalary;
    private String location;

    @ManyToOne
    private Company company;

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Job(long id, String tittle, String description, int minsalary, int maxsalary, String location, Company company) {
        this.id = id;
        this.tittle = tittle;
        this.description = description;
        this.minsalary = minsalary;
        this.maxsalary = maxsalary;
        this.location = location;
        this.company = company;
    }

    public Job() {
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getMinsalary() {
        return minsalary;
    }

    public void setMinsalary(int minsalary) {
        this.minsalary = minsalary;
    }

    public int getMaxsalary() {
        return maxsalary;
    }

    public void setMaxsalary(int maxsalary) {
        this.maxsalary = maxsalary;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
