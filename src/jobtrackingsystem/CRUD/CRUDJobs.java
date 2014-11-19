/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobtrackingsystem.CRUD;

import jobtrackingsystem.UserNJobsTracker.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KevinT
 */
public class CRUDJobs {

    FileReader fr;
    FileWriter fw;
    Scanner sc;
    ArrayList<Job> jobs;

    public void createJobs(Job job) {
        String status = new String();
        if (job.getCompleted() == true) {
            status = "true";
        } else {
            status = "false";
        }
        try {
            fw = new FileWriter(new File("Jobs.txt"));
            fw.write("Id : ");
            fw.write(job.getId());
            fw.write("\n");
            fw.write("Decription : ");
            fw.write(job.getDesc());
            fw.write("\n");
            fw.write("Due Date : ");
            fw.write(job.getDue().toString());
            fw.write("\n");
            fw.write("Status : ");
            fw.write(status);
            fw.write("\n");
            fw.write("Assigned To : ");
            fw.write(job.getAssignedTo().getName());
            fw.write("\n");
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(CRUDJobs.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void insertJobs(Job job) {
        String status = new String();
        if (job.getCompleted() == true) {
            status = "true";
        } else {
            status = "false";
        }
        try {
            fw = new FileWriter("Jobs.txt");
            fw.write("Id : ");
            fw.write(job.getId());
            fw.write("\n");
            fw.write("Decription : ");
            fw.write(job.getDesc());
            fw.write("\n");
            fw.write("Due Date : ");
            fw.write(job.getDue().toString());
            fw.write("\n");
            fw.write("Status : ");
            fw.write(status);
            fw.write("\n");
            fw.write("Assigned To : ");
            fw.write(job.getAssignedTo().getName());
            fw.write("\n");
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(CRUDJobs.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateJobs(Job job) {
        String status = new String();
        if (job.getCompleted() == true) {
            status = "true";
        } else {
            status = "false";
        }
        try {
            fw = new FileWriter("Jobs.txt");
            fw.write("Id : ");
            fw.write(job.getId());
            fw.write("\n");
            fw.write("Decription : ");
            fw.write(job.getDesc());
            fw.write("\n");
            fw.write("Due Date : ");
            fw.write(job.getDue().toString());
            fw.write("\n");
            fw.write("Status : ");
            fw.write(status);
            fw.write("\n");
            fw.write("Assigned To : ");
            fw.write(job.getAssignedTo().getName());
            fw.write("\n");
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(CRUDJobs.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleteJobs(Job job) {
        String status = new String();
        if (job.getCompleted() == true) {
            status = "true";
        } else {
            status = "false";
        }
        try {
            fr = new FileReader("Jobs.txt");
            sc = new Scanner(fr);
            while (sc.hasNext()) {
                if (sc.next().equalsIgnoreCase(job.getId() + job.getDesc() + job.getDue().toString() + status + job.getAssignedTo().getName())) {
                    try {
                        fw = new FileWriter("Jobs.txt");
                        fw.write("");
                        fw.close();
                    } catch (IOException ex) {
                        Logger.getLogger(CRUDJobs.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CRUDJobs.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
