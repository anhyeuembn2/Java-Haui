/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.haui.poly.kt1;
import java.io.Serializable;
/**
 *
 * @author Nguyen Hai Trieu
 */
public class Student extends Person implements Serializable {
    private String studentId;
    private Score score;
    public Student(String name, int age, String gender, String studentId, double score1, double score2, double score3) {
        super(name, age, gender);
        this.studentId = studentId;
        this.score=new Score(score1, score2, score3, score3);
    }
    public String getStudentId() {
        return studentId;
    }
    
    public Score getScore() {
        return score;
    }
    
    public double getAvgScore() {
        return score.getAvgScore();
    }
    @Override
    public String toString() {
        return super.toString() + "\nStudent ID: " + studentId + "\nScore:\n" + score;
    }
}
