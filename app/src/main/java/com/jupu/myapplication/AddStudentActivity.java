package com.jupu.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class AddStudentActivity extends AppCompatActivity {

    private EditText txtStdName;
    private EditText txtStdLastName;
    private EditText txtStdEmail;

    private String name;
    private String lastName;
    private String email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_student);

        txtStdName = findViewById(R.id.txtStdName);
        txtStdLastName = findViewById(R.id.txtStdLastName);
        txtStdEmail = findViewById(R.id.txtStdEmail);

    }

    public void addStudent(View view) {

        RadioGroup rgStudentType = findViewById(R.id.rgStudentType);
        //this.contextkopio = conte
        switch (rgStudentType.getCheckedRadioButtonId()) {
            case R.id.rbTietotekniikka:
                name = String.valueOf((txtStdName.getText()));
                lastName = String.valueOf((txtStdLastName.getText()));
                email = String.valueOf((txtStdEmail.getText()));
                Storage.getInstance().addStudent(new Student(name, lastName, email, "Tietotekniikka"));
                break;
            case R.id.rbTuotantotalous:
                name = String.valueOf((txtStdName.getText()));
                lastName = String.valueOf((txtStdLastName.getText()));
                email = String.valueOf((txtStdEmail.getText()));
                Storage.getInstance().addStudent(new Student(name, lastName, email, "Tuotantotalous"));
                MainActivity.saveStudents(view);
                break;
            case R.id.rbLaskennallinenTekniikka:
                name = String.valueOf((txtStdName.getText()));
                lastName = String.valueOf((txtStdLastName.getText()));
                email = String.valueOf((txtStdEmail.getText()));
                Storage.getInstance().addStudent(new Student(name, lastName, email, "Laskennallinen tekniikka"));
                //Storage.getInstance().saveStudents(context);
                break;
            case R.id.rbSahkotekniikka:
                name = String.valueOf((txtStdName.getText()));
                lastName = String.valueOf((txtStdLastName.getText()));
                email = String.valueOf((txtStdEmail.getText()));
                Storage.getInstance().addStudent(new Student(name, lastName, email, "Sähkötekniikka"));
                //Storage.getInstance().saveStudents(context);
                break;
        }

    }
}