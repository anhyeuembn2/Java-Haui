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
public class Score implements Serializable {
    private double score1;
    private double score2;
    private  double score3;
    private double avgScore;

    public Score(double score1, double score2, double score3, double avgScore) {
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
        this.avgScore = (score1+score2+score3)/3;
    }

    public double getScore1() {
        return score1;
    }

    public void setScore1(double score1) {
        this.score1 = score1;
    }

    public double getScore2() {
        return score2;
    }

    public void setScore2(double score2) {
        this.score2 = score2;
    }

    public double getScore3() {
        return score3;
    }

    public void setScore3(double score3) {
        this.score3 = score3;
    }

    public double getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(double avgScore) {
        this.avgScore = avgScore;
    }
     @Override
    public String toString() {
        return "Score 1: " + score1 + "\nScore 2: " + score2 + "\nScore 3: " + score3 + "\nAverage score: " + avgScore;
    }

}
