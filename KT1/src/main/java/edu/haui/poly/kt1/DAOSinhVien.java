/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.haui.poly.kt1;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
/**
 *
 * @author Nguyen Hai Trieu
 */
public class DAOSinhVien {
    private  final String FILE_PATH="data.dat";
    public ArrayList<Student> readData(){
        ArrayList<Student> students=new ArrayList<>();
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH));
            while (true) {
                Student student = (Student) ois.readObject();
                students.add(student);
            }
        } catch (EOFException e) {
            // End of file reached
        } catch (Exception e) {
            System.out.println("Error reading data: " + e.getMessage());
        }
        return students;
    }
    public void writeData(ArrayList<Student> students) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH));
            for (Student student : students) {
                oos.writeObject(student);
            }
            oos.close();
        } catch (Exception e) {
            System.out.println("Error writing data: " + e.getMessage());
        }
    }
}
