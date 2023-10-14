/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class MainClass {

 public static void main(String[] args) {
     
                 Student std1 = new Student("James", (short) 20);
                 Freshman fresh1 = new Freshman("James", (short) 20, 3.5);
                 Senior std2 = new Senior("John", (short)30, 90);

                  // ToDo 12: Set the GPA of the student using the scanner and user input and then print the output.
                 std1.setGpa(3.7);

                 System.out.println(std1);
                 System.out.println(fresh1);
                 System.out.println(std2);
		
	}

}

