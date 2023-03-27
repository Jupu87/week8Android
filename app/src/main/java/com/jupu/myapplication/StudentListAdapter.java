package com.jupu.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class StudentListAdapter extends RecyclerView.Adapter<StudentViewHolder> {

    private Context context;
    private ArrayList<Student> students = new ArrayList<>();

    public StudentListAdapter(Context context, ArrayList<Student> students) {
        this.context = context;
        this.students = students;
    }

    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new StudentViewHolder(LayoutInflater.from(context).inflate(R.layout.students_view, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder holder, int position) {
        holder.studentName.setText(students.get(position).getName());
        holder.studentLastName.setText(students.get(position).getLastName());
        holder.studentEmail.setText(students.get(position).getMailAddress());
        holder.studentFaculty.setText(students.get(position).getFaculty());


    }

    @Override
    public int getItemCount() {
        return students.size();
    }
}
