package com.jupu.myapplication;

import android.content.Context;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Storage {
     private ArrayList<Student> students = new ArrayList<>();

     private static Storage storage = null;
     public Context contextkopio;


    private Storage() {
    }

    public static Storage getInstance() {
        if(storage == null) {
            storage = new Storage();
        }
        return storage;
    }

    public ArrayList<Student> getstudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void saveStudents(Context context) {
        try {
            ObjectOutputStream studentWriter = new ObjectOutputStream(context.openFileOutput("students.data", Context.MODE_PRIVATE));
            studentWriter.writeObject(students);
            studentWriter.close();
        } catch (IOException e) {
            System.out.println("Oppilaiden tallentaminen ei onnistunut1");
        }
    }

    public void loadStudents(Context context) {
        try {
            ObjectInputStream studentReader = new ObjectInputStream(context.openFileInput("students.data"));
            students = (ArrayList<Student>) studentReader.readObject();
            studentReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Oppilaiden lukeminen ei onnistunut2");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Oppilaiden lukeminen ei onnistunut3");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Oppilaiden lukeminen ei onnistunut4");
            e.printStackTrace();
        }
    }


}
