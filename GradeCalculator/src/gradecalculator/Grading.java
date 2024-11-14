/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gradecalculator;

import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Grading {
  

    // Method to get marks from the user
    public static int getMarks(Scanner scanner, int index) {
        System.out.print("Enter Marks " + index + ": ");
        return scanner.nextInt();
    }

    // Method to determine the grade for a mark
    public static char getGrade(int mark) {
        if (mark >= 90) {
            return 'A';
        } else if (mark >= 80) {
            return 'B';
        } else if (mark >= 70) {
            return 'C';
        } else if (mark >= 60) {
            return 'D';
        } else {
            return 'E';
        }
    }

    // Method to count the grade
    public static void countGrade(char grade, int[] gradeCount) {
        switch (grade) {
            case 'A':
                gradeCount[0]++;
                break;
            case 'B':
                gradeCount[1]++;
                break;
            case 'C':
                gradeCount[2]++;
                break;
            case 'D':
                gradeCount[3]++;
                break;
            case 'E':
                gradeCount[4]++;
                break;
        }
    }

    // Method to display the count of each grade
    public static void displayGradeCount(int[] gradeCount) {
        System.out.println("Grade A: " + gradeCount[0]);
        System.out.println("Grade B: " + gradeCount[1]);
        System.out.println("Grade C: " + gradeCount[2]);
        System.out.println("Grade D: " + gradeCount[3]);
        System.out.println("Grade E: " + gradeCount[4]);
    }
}

