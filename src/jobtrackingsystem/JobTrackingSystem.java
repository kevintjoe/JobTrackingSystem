/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jobtrackingsystem;

import java.util.Date;
import java.util.Scanner;
import jobtrackingsystem.CRUD.CRUDJobs;
import jobtrackingsystem.CRUD.CRUDUser;
import jobtrackingsystem.UserNJobsTracker.Job;
import jobtrackingsystem.UserNJobsTracker.User;

/**
 *
 * @author i12081
 */
public class JobTrackingSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan nama user : ");
        String name = sc.nextLine();
        System.out.println("Masukkan Email dari user : ");
        String email = sc.nextLine();
        System.out.println("Masukkan Id Job :");
        String id = sc.nextLine();
        System.out.println("Masukkan Deskripsi dari job : ");
        String desc = sc.nextLine();
        System.out.println("Masukkan Due date dari job : ");
        Date due = new Date();
        due.getDate();
        System.out.println("Masukkan user yang di assign : ");
        User user = new User(name , email);
        Job job = new Job(id , desc,due,user);
        CRUDUser crudUser = new CRUDUser();
        crudUser.createJobs(user);
        CRUDJobs crudJob = new CRUDJobs();
        crudJob.createJobs(job);
    }
    
}
