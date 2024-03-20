package com.jerrycodes.studentsystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // 类的属性
    private int id;
    private String name;
    private String address;


    // 类的实例对象：Alt + Insert - Constructor - int.int
    public Student() {}

    // 类的方法：Alt + Insert - Getter and Setter - int.int, name:String, address:String
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
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}
