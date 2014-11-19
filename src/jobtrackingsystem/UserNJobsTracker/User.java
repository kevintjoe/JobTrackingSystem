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
class User {

    String name;
    String emailAddress;
    ArrayList<Job> jobs;

    public User(String name, String emailAddresss) {
        this.name = name;
        this.emailAddress = emailAddresss;
    }

    public String getJobs() {
        String JobsId=new String();
        Job[] jobses = new Job[jobs.size()];
        int i = 0;
        while (jobs.iterator().hasNext()) {
            JobsId = jobs.iterator().next().getDesc();
            JobsId = "\n";
            i++;
        }
        return JobsId;
    }

}
