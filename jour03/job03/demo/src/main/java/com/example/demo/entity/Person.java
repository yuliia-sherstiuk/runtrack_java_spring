package com.example.demo.entity;




import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity  // помечает класс как JPA-сущность (будет таблицей в БД)
public class Person {

    @Id  // указывает первичный ключ
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    private Long id;  

    private String name;
    private int age;

    // --- Конструкторы ---
    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // --- Getters / Setters ---
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
