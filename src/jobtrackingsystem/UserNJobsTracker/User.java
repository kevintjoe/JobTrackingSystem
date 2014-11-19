/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobtrackingsystem.UserNJobsTracker;

import java.util.ArrayList;

/**
 *
 * @author KevinT
 */
public class User {

    String name;
    String emailAddress;
    ArrayList<Job> jobs;

    public User(String name, String emailAddresss) {
        this.name = name;
        this.emailAddress = emailAddresss;
    }
    
    public String getName()
    {
        return this.name = name;
    }
    public String getEmailAddress()
    {
        return this.emailAddress=emailAddress;
    }
    
    public void setName(String name)
    {
        this.name=name;
    }
    public void setEmailAddress(String emailAddress)
    {
        this.emailAddress=emailAddress;
    }

    public String getJobsID() {
        String JobsId = new String();
        int i = 0;
        while (jobs.iterator().hasNext()) {
            JobsId = jobs.iterator().next().getDesc();
            JobsId = "\n";
            i++;
        }
        return JobsId;
    }

    public Job[] getJobs() {
        Job[] jobses = new Job[jobs.size()];
        int i = 0;
        while (jobs.iterator().hasNext()) {
            jobses[i] = jobs.iterator().next();
        }
        return jobses;
    }

    public void gotJobs(Job job) {
        jobs.add(job);
    }

    public void completedAJob(Job job) {
        job.setCompleted();
    }

    public Job[] jobsCompleted() {
        int i = 0;
        Job[] completedJobs = null;
        while (jobs.iterator().hasNext()) {
            if (jobs.iterator().next().getCompleted() == true) {
                completedJobs[i] = jobs.iterator().next();
            } else {
            }
            i++;
        }
        return completedJobs;
    }
}
