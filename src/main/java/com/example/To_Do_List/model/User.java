package com.example.To_Do_List.model;
import jakarta.persistence.*;
@Entity
public class User {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

       private Long id;
     private String first_name;
     private String last_name;
     private String email;
    private String password;

    public String getFirst_name() {
        return first_name;
    }

    public Long getId() {
        return id;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
