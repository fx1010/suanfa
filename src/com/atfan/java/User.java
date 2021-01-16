package com.atfan.java;

/**
 * @author fx
 * @create 2021-01-14 23:14
 */
class User {
    public String name;
    protected int age;
    private String email;

    public User() {
    }

    public User(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }
}
