package com.example.addrop;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.mockito.Mockito;

import java.sql.SQLException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class StudentTest {
    Student student;
    DBconnect db;

    @Before
    public void setUp() throws Exception {
        db = Mockito.mock(DBconnect.class);
        student = new Student(db);
    }

    @After
    public void tearDown() throws Exception {
        student = null;
    }

    @Test
    public void getFname() {
        when(db.Fname()).thenReturn("Mubin");
        assertEquals("Mubin",student.getFname());
    }


    @Test
    public void getEmail() {
        when(db.eMail()).thenReturn("uic.mubin@gmail.com");
        assertEquals("uic.mubin@gmail.com",student.getEmail());
    }

    @Test
    public void getId() throws SQLException {
        when(db.Id()).thenReturn(18101640);
        assertEquals(18101640,student.getId());
    }

    @Test
    public void setId() {
    }

    @Test
    public void getPassword() {
    }

    @Test
    public void getPhone() {
    }
}