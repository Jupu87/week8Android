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
    //protected int image;
    public String faculty;
    //protected int image;

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

    public void setFaculty(int faculty) {
        this.faculty = String.valueOf(faculty);
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

    //public int getImage() {
    //    return image;
    //}

}
