/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobtrackingsystem.CRUD;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import jobtrackingsystem.UserNJobsTracker.Job;
import jobtrackingsystem.UserNJobsTracker.User;

/**
 *
 * @author KevinT
 */
public class CRUDUser {

    FileReader fr;
    FileWriter fw;
    Scanner sc;
    ArrayList<Job> jobs;

    public void createJobs(User user) {
        try {
            fw = new FileWriter(new File("Users.txt"));
            fw.write("Name : ");
            fw.write(user.getName());
            fw.write("\n");
            fw.write("Email Address : ");
            fw.write(user.getEmailAddress());
            fw.write("\n");
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(CRUDJobs.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void insertJobs(User user) {
        try {
            fw = new FileWriter("Users.txt");
            fw.write("Name : ");
            fw.write(user.getName());
            fw.write("\n");
            fw.write("Email Address : ");
            fw.write(user.getEmailAddress());
            fw.write("\n");
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(CRUDJobs.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateJobs(User user) {
        try {
            fw = new FileWriter("Users.txt");
            fw.write("Name : ");
            fw.write(user.getName());
            fw.write("\n");
            fw.write("Email Address : ");
            fw.write(user.getEmailAddress());
            fw.write("\n");
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(CRUDJobs.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleteJobs(User user) {
        try {
            fr = new FileReader("Users.txt");
            sc = new Scanner(fr);
            while (sc.hasNext()) {
                if (sc.next().equalsIgnoreCase(user.getName() + user.getEmailAddress())) {
                    try {
                        fw = new FileWriter("Users.txt");
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
