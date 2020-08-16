package com.jakes.movies.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Producent {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer id;
    private String name;
    private String address;

    public Producent(Integer id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Producent() {
    }

    @Override
    public String toString() {
        return "Producent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
