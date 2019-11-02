package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.myapplication.dataModels.Student;


import java.util.ArrayList;

public class StudentAdapter extends ArrayAdapter<Student> {
    private ArrayList<Student> dataSet;
    private Context context;

    private static class ViewHolder{
        TextView tvname;
        TextView tvid;
        TextView tvc;
    }

    public StudentAdapter(ArrayList<Student> data, Context context){
        super(context, R.layout.student_list_item, data);
        this.dataSet = data;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Student student = getItem(position);
        ViewHolder holder;

        if(convertView == null){
            holder = new ViewHolder();
            convertView = LayoutInflater.from(context).inflate(R.layout.student_list_item, parent, false);
            holder.tvname = convertView.findViewById(R.id.tvstudentname);
            holder.tvid = convertView.findViewById(R.id.tvstudentid);
            holder.tvc = convertView.findViewById(R.id.tvstudentcourse);

            convertView.setTag(holder);
        }else{
            holder = (ViewHolder) convertView.getTag();
        }
        holder.tvname.setText(student.getStudentName());
        holder.tvid.setText(student.getstudentID());
        holder.tvc.setText(student.getStudentCourse());

        return convertView;
    }
}
