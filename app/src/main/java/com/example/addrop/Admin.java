package com.example.addrop;


import java.sql.SQLException;

public class Admin {
     public DBconnect db;
    public Admin (DBconnect db1){
        this.db = db1;

    }
    public String AName (){

        return db.Fname();

    }
    public String APassword () throws SQLException {
        return db.Pass();

    }

}