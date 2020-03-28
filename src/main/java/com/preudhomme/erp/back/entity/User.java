package com.preudhomme.erp.back.entity;

import javax.persistence.*;

@Entity
public class User {
    @Id
    private Long id;
    @Column(columnDefinition = "TEXT")
    private String firstName;
    @Column(columnDefinition = "TEXT")
    private String lastName;
    @Column
    private int age;
    @Column(columnDefinition = "TEXT")
    private String adresse;

    public User (Long id, String firstName, String lastName, int age, String adresse) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.adresse = adresse;
    }

    public User () {
    }

    public Long getId () {
        return id;
    }

    public void setId (Long id) {
        this.id = id;
    }

    public String getFirstName () {
        return firstName;
    }

    public void setFirstName (String firstName) {
        this.firstName = firstName;
    }

    public String getLastName () {
        return lastName;
    }

    public void setLastName (String lastName) {
        this.lastName = lastName;
    }

    public int getAge () {
        return age;
    }

    public void setAge (int age) {
        this.age = age;
    }

    public String getAdresse () {
        return adresse;
    }

    public void setAdresse (String adresse) {
        this.adresse = adresse;
    }
}
