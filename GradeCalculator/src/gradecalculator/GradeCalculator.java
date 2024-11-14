/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gradecalculator;

/**
 *
 * @author USER
 */
import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int[] marks = new int[10]; // Array to store 10 marks
        int[] gradeCount = new int[5]; // Array to store count of grades A, B, C, D, E
        
        // Input 10 marks from the user
        for (int i = 0; i < 10; i++) {
            marks[i] = Grading.getMarks(reader, i + 1);
        }
        
        // Process each mark and count the grades
        for (int mark : marks) {
            char grade = Grading.getGrade(mark);
            Grading.countGrade(grade, gradeCount);
        }
        
        // Display the result
        Grading.displayGradeCount(gradeCount);
    }
}

