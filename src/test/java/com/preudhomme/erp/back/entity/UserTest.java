package com.preudhomme.erp.back.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void getId () {
        User userTest = new User ((long) 1, "testFirstName","testLastName",21,"Montpellier");
        assertEquals(1, userTest.getId ());
    }

    @Test
    void setId () {
        User userTest = new User ((long) 1, "testFirstName","testLastName",21,"Montpellier");
        userTest.setId ((long) 2);
        assertEquals(2, userTest.getId ());
    }

    @Test
    void getFirstName () {
        User userTest = new User ((long) 1, "testFirstName","testLastName",21,"Montpellier");
        assertEquals("testFirstName", userTest.getFirstName ());
    }

    @Test
    void setFirstName () {
        User userTest = new User ((long) 1, "testFirstName","testLastName",21,"Montpellier");
        userTest.setFirstName ("testFirstName2");
        assertEquals("testFirstName2", userTest.getFirstName ());
    }

    @Test
    void getLastName () {
        User userTest = new User ((long) 1, "testFirstName","testLastName",21,"Montpellier");
        assertEquals("testLastName", userTest.getLastName ());
    }

    @Test
    void setLastName () {
        User userTest = new User ((long) 1, "testFirstName","testLastName",21,"Montpellier");
        userTest.setLastName ("testLastName2");
        assertEquals("testLastName2", userTest.getLastName ());
    }

    @Test
    void getAge () {
        User userTest = new User ((long) 1, "testFirstName","testLastName",21,"Montpellier");
        assertEquals(21, userTest.getAge ());
    }

    @Test
    void setAge () {
        User userTest = new User ((long) 1, "testFirstName","testLastName",21,"Montpellier");
        userTest.setAge (20);
        assertEquals(20, userTest.getAge ());
    }

    @Test
    void getAdresse () {
        User userTest = new User ((long) 1, "testFirstName","testLastName",21,"Montpellier");
        assertEquals("Montpellier", userTest.getAdresse ());
    }

    @Test
    void setAdresse () {
        User userTest = new User ((long) 1, "testFirstName","testLastName",21,"Montpellier");
        userTest.setAdresse ("Lyon");
        assertEquals("Lyon", userTest.getAdresse ());
    }
}