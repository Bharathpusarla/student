package com.micro.job.job;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/job")
public class JobController {
    private JobService jobService;

    public JobController(JobService jobService) {
        this.jobService = jobService;
    }
    @GetMapping()
    public ResponseEntity<List<Job>> getalljobs(){
        return new ResponseEntity<>(jobService.getalljobs(), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Job> getjobyid(@PathVariable Long id){
            Job job = jobService.getjobbyid(id);
            if(job != null) {
                return new ResponseEntity<>(job, HttpStatus.OK);
            }
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @PostMapping
    public ResponseEntity<String> create(@RequestBody Job job){
        jobService.create(job);
        return new ResponseEntity<>( "created sucessfully",HttpStatus.CREATED);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id){
      boolean deleted = jobService.delete(id);
         if (deleted)
             return new ResponseEntity<>("deleted sucessfully", HttpStatus.OK);
         return new ResponseEntity<>("ID not found",HttpStatus.NOT_FOUND);
    }
    @PutMapping("/{id}")
    public ResponseEntity<String> update(@PathVariable Long id,@RequestBody Job job){
         boolean updated = jobService.updatejob(id,job);
         if(updated) {
             return new ResponseEntity<>("updated sucessfully", HttpStatus.OK);
         }
         return new ResponseEntity<>("ID not found",HttpStatus.NOT_FOUND);

    }





}
