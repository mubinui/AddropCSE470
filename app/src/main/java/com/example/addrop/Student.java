package com.example.addrop;


import java.sql.SQLException;

public class Student {
    DBconnect db;
    public Student(DBconnect db1){
        this.db = db1;

    }
    String fname;
    String lname;
    String phone;
    String password ;
    String Email;
    int Id ;




    public void setFname (String fname ){
        this.fname = fname;

    }
    public String getFname(){
        setFname(db.Fname());

        return fname;
    }

    public void setLname(String lname){
        this.lname = lname;

    }

    public void setEmail(String email) {
        Email = email;
    }
    public String getEmail(){
        setEmail(db.eMail());

        return Email;
    }

    public int getId() throws SQLException {
        setId(db.Id());

        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getPhone(){
     return phone;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
}
