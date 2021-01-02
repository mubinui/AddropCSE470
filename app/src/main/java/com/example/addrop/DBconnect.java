package com.example.addrop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class DBconnect {

    public String url = "jdbc:mysql://localhost:3306/addrop";
    String user ="root";
    String password = "100101@Xeroic";

    Connection connection = connection = DriverManager.getConnection(url,user,password);

    Statement statement = connection.createStatement();
    String SQ = "SELECT*FROM students";
    ResultSet resultSet =statement.executeQuery(SQ);


    public DBconnect() throws SQLException {
    }


    public String Fname (){
        String name = "Select fname  From Students";

        return name;
    }
    public String  Lname (){
        String  lname = "Select lname from students ";
        return  lname;
    }
    public int Id () throws SQLException {
        int id = resultSet.getInt( "Select id from Students ");
        return id ;
    }
    public String phone(){
        String phone = "Select phnNumber from Students ";
        return phone ;
    }

    public String Aaname() throws SQLException {
        String aname = resultSet.getString("AName");
        return aname ;
    }
    public String Pass () throws SQLException {
        String pass = resultSet.getString("Password");
        return pass;
    }

    public String eMail (){
        String em = "Select email  FROM Students";
        return  em;
    }
    public String   stCourse() throws SQLException {
         String sc = resultSet.getString("Course1");
         return sc ;

    }
    public String AddedCourse(){
        String sk = " SELECT AddCourse from Students";

        return sk;

    }
    public String DeletedCourse (){
        String xc  = "Nothing left";
        return xc ;
    }



}
