package com.jupu.myapplication;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

public class Student {
    public String name;
    public String lastName;
    public String mailAddress;
    public String faculty;


    //public static int studentCounter = 0;

    public Student() {
        this("test", "test2", "test3", "test4");

    }

    public Student(String name, String lastName, String mailAddress, String faculty) {
        this.name = name;
        this.lastName = lastName;
        this.mailAddress = mailAddress;
        this.faculty = faculty;

        //studentCounter++;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setName(int name) {
        this.name = String.valueOf(name);
    }

    public void setLastName(String name) {
        this.lastName = lastName;
    }

    public void setLastName(int lastName) {
        this.lastName = String.valueOf(lastName);
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    public void setMailAddress(int mailAddress) {
        this.mailAddress = String.valueOf(mailAddress);
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setFaculty(int faculty) { this.faculty = String.valueOf(faculty); }

    public void setgrade1(String grade1) { this.name = grade1; }

    public void setgrade1(int grade1) { this.name = String.valueOf(grade1); }
    public void setgrade2(String grade2) {
        this.name = grade2;
    }

    public void setgrade2(int grade2) {
        this.name = String.valueOf(grade2);
    }
    public void setgrade3(String grade3) {
        this.name = grade3;
    }

    public void setgrade3(int grade3) {
        this.name = String.valueOf(grade3);
    }
    public void setgrade4(String grade4) {
        this.name = grade4;
    }

    public void setgrade4(int grade4) {
        this.name = String.valueOf(grade4);
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMailAddress() {
        return mailAddress;
    }

    public String getFaculty() {
        return faculty;
    }


}
