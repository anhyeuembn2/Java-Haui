/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.haui.poly.kt1;

/**
 *
 * @author Nguyen Hai Trieu
 */
import java.util.ArrayList;
import java.util.Scanner;

public class QLSV {
    private ArrayList<Student> students;
    private DAOSinhVien dao;
    
    public QLSV() {
        dao = new DAOSinhVien();
        students = dao.readData();
    }
    
    public void addStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student name:");
        String name = scanner.nextLine();
        System.out.println("Enter student age:");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter student gender:");
        String gender = scanner.nextLine();
        System.out.println("Enter student ID:");
        String studentId = scanner.nextLine();
        System.out.println("Enter score 1:");
        double score1 = scanner.nextDouble();
        System.out.println("Enter score 2:");
        double score2 = scanner.nextDouble();
        System.out.println("Enter score 3:");
        double score3 = scanner.nextDouble();
        Student student = new Student(name, age, gender, studentId, score1, score2, score3);
        students.add(student);
        dao.writeData(students);
    }
    
    public void displayStudents() {
        for (Student student : students) {
            System.out.println(student);
            System.out.println();
        }
    }
    
    public void searchStudents() {
        System.out.println("Students with average score >= 5:");
        for (Student student : students) {
            if (student.getAvgScore() >= 5) {
                System.out.println(student);
                System.out.println();
            }
        }
    }
}


