package com.example.demoday004.entity;

public class qdd {
    private int id;
    private String name;
    private String sex;

    public qdd(int id, String name, String sex) {
        this.id = id;
        this.name = name;
        this.sex = sex;
    }

    public qdd() {
    }

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
