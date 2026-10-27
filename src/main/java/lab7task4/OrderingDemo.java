/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7task4;

/**
 *
 * @author natas
 */

import java.util.ArrayList;
import java.util.Collections;

public class OrderingDemo {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(103, 3.50));
        students.add(new Student(101, 3.80));
        students.add(new Student(102, 3.20));

        // Sort by roll number (ascending)
        Collections.sort(students);

        System.out.println("Sorted by Roll Number:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Sort by CGPA (descending)
        Collections.sort(students, new CgpaComparator());

        System.out.println("\nSorted by CGPA (Descending):");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
