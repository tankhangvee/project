package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class StudentProfileActivity extends AppCompatActivity {

    private String selfIntro = "Hello [name], \n" + "ID is [studentID] \n" + "[course] student";
    private String studentName, studentID, studentCourse;
    private TextView tvselfintro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_profile);

        studentName = getIntent().getStringExtra("name");
        studentID = getIntent().getStringExtra("id");
        studentCourse = getIntent().getStringExtra("course");

        replaceData();

        tvselfintro = findViewById(R.id.studentselfintro);
        tvselfintro.setText(selfIntro);
    }
    private void replaceData(){
        selfIntro = selfIntro.replace("[name]",studentName);
        selfIntro = selfIntro.replace("[studentID]",studentID);
        selfIntro = selfIntro.replace("[course]",studentCourse);
    }
}
