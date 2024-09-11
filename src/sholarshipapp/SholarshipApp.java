/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sholarshipapp;

import com.sun.glass.ui.Application;
import java.util.Scanner;

/**
 *
 * @author SCC-COLLEGE
 */
public class SholarshipApp {

    private static ScholarshipApps[] Sapp;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ScholarshipApps manager = null;
       

        System.out.println("Enter number of applications to input:");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.println("Enter application " + (i + 1) + " details:");
            
            System.out.print("ID: ");
            String id = scanner.nextLine();
            
            System.out.print("Name: ");
            String name = scanner.nextLine();
            
            System.out.print("GPA: ");
            double gpa = scanner.nextDouble();
            
            System.out.print("Annual Family Income: ");
            double income = scanner.nextDouble();
            
            System.out.print("Community Service Hours: ");
            int hours = scanner.nextInt();
            
            
            Sapp[i] = new ScholarshipApps();
            Sapp[i].AddScholarshipApps(id,name,gpa,income,hours);

            System.out.println("\nChecking eligibility for " + name + ":");
            if (manager.checkEligibility) {
                System.out.println(name + " is eligible for the scholarship.\n");
            } else {
                System.out.println(name + " is not eligible for the scholarship.\n");
            }
        }

     System.out.println("All applications:");
        manager.viewApplications();
    }
}
    
    
    

