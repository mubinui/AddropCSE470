package com.example.addrop;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class AdminTest {
    DBconnect db;
    Admin admin;

    @Before
    public void setUp() throws Exception {
        db = Mockito.mock(DBconnect.class);
        admin = new Admin(db);
    }

    @After
    public void tearDown() throws Exception {
        admin = null;
    }

    @Test
    public void AName() {
    }

    @Test
    public void APassword() {
    }
}