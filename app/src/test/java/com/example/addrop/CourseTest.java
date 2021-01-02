package com.example.addrop;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class CourseTest {
    DBconnect db;
    Course c ;


    @Before
    public void setUp() throws Exception {
        db = Mockito.mock(DBconnect.class);
        c = new Course(db);
    }

    @After
    public void tearDown() throws Exception {
        c = null;
    }

    @Test
    public void getCourseCode() {

    }

    @Test
    public void setCourse() {
    }

    @Test
    public void addedCourse() {
    }

    @Test
    public void deletedCourse() {
    }
}