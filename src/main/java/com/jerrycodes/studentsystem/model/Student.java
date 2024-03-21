package com.jerrycodes.studentsystem.model;

import com.jerrycodes.studentsystem.repository.StudentRepository;
import jakarta.persistence.*;

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

    // 为删除学生而写
    public Student(String name, String address) {
        this.name = name;
        this.address = address;
    }

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
    // 删除学生信息
    public void delete(EntityManager entityManager) {
        entityManager.getTransaction().begin();
        entityManager.remove(this);
        entityManager.getTransaction().commit();
    }
    // 修改学生信息
    public void update(String newName, String newAddress) {
        if (newName != null) {
            this.name = newName;
        }
        if (newAddress != null) {
            this.address = newAddress;
        }
    }
}
