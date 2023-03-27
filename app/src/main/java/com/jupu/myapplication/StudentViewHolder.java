package com.jupu.myapplication;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class StudentViewHolder extends RecyclerView.ViewHolder {
    //ImageView studentImage;
    TextView studentName, studentLastName, studentEmail, studentFaculty;

    public StudentViewHolder(@NonNull View itemView) {
        super(itemView);
        //studentImage = itemView.findViewById(R.id.ivStudentImage);
        studentName = itemView.findViewById(R.id.txtStudentName);
        studentLastName = itemView.findViewById(R.id.txtStudentLastName);
        studentEmail = itemView.findViewById(R.id.txtEmailAddress);
        studentFaculty = itemView.findViewById(R.id.txtStudentFaculty);


    }
}
