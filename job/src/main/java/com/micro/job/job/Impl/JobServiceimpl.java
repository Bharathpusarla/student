package com.micro.job.job.Impl;

import com.micro.job.job.Job;
import com.micro.job.job.JobRepository;
import com.micro.job.job.JobService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobServiceimpl implements JobService {
    private JobRepository jobRepository;

    public JobServiceimpl(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    @Override
    public List<Job> getalljobs() {
        return jobRepository.findAll();
    }

    @Override
    public Job getjobbyid(Long id) {
        return jobRepository.findById(id).orElse(null);
    }

    @Override
    public void create(Job job) {
        jobRepository.save(job);
    }

    @Override
    public boolean delete(Long id) {
        Optional<Job> jobOptional = jobRepository.findById(id);
        if (jobOptional.isPresent()) {
            jobRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public boolean updatejob(Long id, Job job) {
       Optional<Job> existingjobOptional = jobRepository.findById(id);
       if(existingjobOptional.isPresent()){
           Job existingjob = existingjobOptional.get();
            existingjob.setTittle(job.getTittle());
            existingjob.setDescription(job.getDescription());
            existingjob.setMaxsalary(job.getMaxsalary());
            existingjob.setMinsalary(job.getMinsalary());
            existingjob.setLocation(job.getLocation());
            jobRepository.save(existingjob);
            return true;
        }

        return false;
    }

}
