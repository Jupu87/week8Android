package com.jupu.myapplication;

import java.util.ArrayList;

public class Storage {
     private ArrayList<Student> students = new ArrayList<>();

     private static Storage storage = null;


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

    public Student getRocketById(int id) {
        return students.remove(id);
    }

    public void listRockets() {
        int i = 0;
        for (Student student : students) {
            System.out.println(i++ + ": " + student.getName());
        }
    }


}
