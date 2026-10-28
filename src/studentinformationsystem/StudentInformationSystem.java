/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentinformationsystem;

/**
 *
 * @author sbrna
 */
public class StudentInformationSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String studentName = "Sabrina";
        String studentID = "S86129";
        
        int mark1 = 75;
        int mark2 = 60;
        
        int total = mark1+mark2;
        
        System.out.println("Student Name: " + studentName);
        System.out.println("Student ID: " + studentID);
        System.out.println();
        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
        System.out.println("Total Marks: " + total);
        
        if (total >= 165) {
            System.out.println("Result: Excellent");
        } else if (total >=100) {
            System.out.println("Result: Good");
        } else {
            System.out.println("Result: Need Improvement");
        }
        
        
        

    }
    
}
