package com.micro.job.companies;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.micro.job.job.Job;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String descriptions;
    @JsonIgnore
    @OneToMany(mappedBy = "company")
    List<Job> jobs;

    public Company() {
    }

    public Company(Long id, String name, String descriptions, List<Job> jobs) {
        this.id = id;
        this.name = name;
        this.descriptions = descriptions;
        this.jobs = jobs;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }
}
