package com.redhat.developers;

import java.util.List;

import javax.persistence.Entity;


import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Todo extends PanacheEntity {
    
    public String name;

    public String task;

    public static List<Todo> findByName(String name) {
        return find("name", name).list();
    }

}