/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobtrackingsystem.UserNJobsTracker;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

/**
 *
 * @author KevinT
 */
class Job {

    String id;
    String description;
    Date due;
    User assignedTo;
    boolean completed;
    ArrayList<Job> jobs;

    public Job(String id, String desc, Date due, User assignedTo) {
        this.id = id;
        this.description = desc;
        this.due = due;
        this.assignedTo = assignedTo;
    }

    public String getId() {
        return this.id;
    }

    public String getDesc() {
        return this.description;
    }

    public Date getDue() {
        return this.due;
    }

    public User getAssignedTo() {
        return this.assignedTo;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDesc(String desc) {
        this.description = desc;
    }

    public void setDue(Date due) {
        this.due= due;
    }

    public void setAssignedTo(User user) {
        this.assignedTo=user;
    }

    public void insertJob(Job job) {
        jobs.add(job);
    }

    public Job[] findAllJobs() {
        Job[] jobses = new Job[jobs.size()];
        int i = 0;
        if (jobs == null) {

        } else {
            while (jobs.iterator().hasNext()) {
                jobses[i] = jobs.iterator().next();
                i++;
            }
        }
        return jobses;
    }

    public void updateJob(Job job) {
        this = new Job();
    }

    public Job[] findAllJobAssignedTo(User user) {
    }

    public Job[] findAllCompletedJobs(User user) {
    }

    public void deleteJob(Job job) {
    }
}
