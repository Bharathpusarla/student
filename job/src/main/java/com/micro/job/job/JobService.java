package com.micro.job.job;

import java.util.List;

public interface JobService {

    List<Job> getalljobs();

    Job getjobbyid(Long id);

    void create(Job job);

    boolean delete(Long id);

    boolean updatejob(Long id, Job job);
}
