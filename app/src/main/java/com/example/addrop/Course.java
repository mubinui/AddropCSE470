package com.example.addrop;

import java.sql.SQLException;

public class Course {
    String CourseName ;

    DBconnect db;
    public Course(DBconnect db1){
        this.db = db1;
    }


    public String  getCourseCode() throws SQLException {

        return db.stCourse();

    }
    public void  setCourse(String c){
        this.CourseName = c;
    }
    public String AddedCourse(){


        return db.AddedCourse();

    }
    public String DeletedCourse (){
        return db.DeletedCourse();
    }
}
