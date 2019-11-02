package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.myapplication.dataModels.Student;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView lvstudent;
    private ArrayList<Student> arrayListStudent = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvstudent = findViewById(R.id.listviewstudent);
        arrayListStudent.add(new Student("Tan Khang Vee", "12345", "DIT"));
        arrayListStudent.add(new Student("Ali", "23456", "DIT"));
        arrayListStudent.add(new Student("AHeng", "34567", "DIT"));
        arrayListStudent.add(new Student("AMing", "45678", "DIT"));

        StudentAdapter adapter = new StudentAdapter(arrayListStudent, this);

        lvstudent.setAdapter(adapter);

        lvstudent.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Student student = (Student) parent.getAdapter().getItem(position);

                Intent i = new Intent(MainActivity.this, StudentProfileActivity.class);
                i.putExtra("name",student.getStudentName());
                i.putExtra("id",student.getstudentID());
                i.putExtra("course",student.getStudentCourse());
                startActivity(i);
            }
        });
    }

}
