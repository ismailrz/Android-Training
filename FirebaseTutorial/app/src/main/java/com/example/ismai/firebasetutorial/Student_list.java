package com.example.ismai.firebasetutorial;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class Student_list extends ArrayAdapter<Student> {


    private Activity context;
    private List<Student> studentList;

    public Student_list(Activity context, List<Student> studentList ) {

        super(context, R.layout.list_layout, studentList);

        this.context = context;
        this.studentList = studentList;

            }

    @androidx.annotation.NonNull
    @Override
    public View getView(int position, @androidx.annotation.Nullable View convertView, @androidx.annotation.NonNull ViewGroup parent) {


        LayoutInflater inflater  = context.getLayoutInflater();

        View listViewItem = inflater.inflate(R.layout.list_layout, null, true);

        TextView textViewname= listViewItem.findViewById(R.id.textNameId);

        TextView textViewDepartment = listViewItem.findViewById(R.id.textDepartmentId);

        Student student = studentList.get(position);
        textViewname.setText(student.getName());
        textViewDepartment.setText(student.getDepartment());

        return  listViewItem;
    }
}
