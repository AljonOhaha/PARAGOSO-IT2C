/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sholarshipapp;

/**
 *
 * @author SCC-COLLEGE
 */
public class ScholarshipApps {
    
    
         private final String id;
    private final String name;
    private final double gpa;
    private final double familyIncome;
    private final int communityServiceHours;
    boolean checkEligibility;

    
 
   
    
    

    // Constructor
    public ScholarshipApps(String id, String name, double gpa, double familyIncome, int communityServiceHours) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
        this.familyIncome = familyIncome;
        this.communityServiceHours = communityServiceHours;
    }

    ScholarshipApps() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    

   
    

  
    public void displayApplicationDetails() {
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("GPA: " + this.gpa);
        System.out.println("Annual Family Income: " + this.familyIncome);
        System.out.println("Community Service Hours: " + this.communityServiceHours);
    }

  
    public static void addScholarshipApp(ScholarshipApps app) {
        ScholarshipApps.addScholarshipApp(app);
        System.out.println("Application added for: " + app.name);
    }

  
    public static void viewApplications(Iterable<ScholarshipApps> ScholarshipApps, boolean ScholarshipApp) {
        if (ScholarshipApp) {
            System.out.println("No applications available.");
        } else {
            for (ScholarshipApps app : ScholarshipApps) {
                app.displayApplicationDetails();
                System.out.println("--------------------------");
            }
        }
    }

    void AddScholarshipApps(String id, String name, double gpa, double income, int hours) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void viewApplications() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
