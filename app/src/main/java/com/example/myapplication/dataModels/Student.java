package com.example.myapplication.dataModels;

public class Student {
    private String studentName;
    private String studentID;
    private String studentCourse;

    public Student(){

    }
    public Student(String name, String id, String course){
        studentName = name;
        studentID = id;
        studentCourse = course;
    }
    public String getStudentName(){
        return this.studentName;
    }

    public String getstudentID(){
        return this.studentID;
    }

    public String getStudentCourse(){
        return this.studentCourse;
    }
}


