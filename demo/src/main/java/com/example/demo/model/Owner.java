package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "owner_table")
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "oid")
    private int id;

    @Column(name = "oname", length = 50, nullable = false)
    private String name;

    @Column(name = "oemail", length = 50, nullable = false)
    private String email;

    @Column(name = "ogender", length = 10, nullable = false)
    private String gender;

    @Column(name = "ocontact", length = 10, nullable = false)
    private String contact;

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Owner [id=" + id + ", name=" + name + ", email=" + email + ", gender=" + gender + ", contact=" + contact + "]";
    }
}
