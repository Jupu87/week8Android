package com.jupu.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static Context context;
    private Integer apu = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Storage s = Storage.getInstance();
        context = MainActivity.this;

        System.out.println("paskaaaaaaa");
        System.out.println(context);

        if(apu == 0){
            Storage.getInstance().loadStudents(context);
            apu = 1;

        context = MainActivity.this;
        }
    }

    public void switchToAddStudent(View view) {
        Intent intent = new Intent(this, AddStudentActivity.class);
        startActivity(intent);
    }

    public void switchToStudentsList(View view) {
        Intent intent = new Intent(this, StudentListActivity.class);
        startActivity(intent);
    }

    public static void saveStudents(View view) { Storage.getInstance().saveStudents(context); }

    public void loadStudents(View view) {
        Storage.getInstance().loadStudents(context);
    }

}