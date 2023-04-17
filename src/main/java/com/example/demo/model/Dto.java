package com.example.demo.model;

import java.io.Serializable;

public class Dto implements Serializable {
    public Long id;
    public String name;

    public Dto(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
