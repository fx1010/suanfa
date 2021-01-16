package com.atfan.bean;

/**
 * @author fx
 * @create 2021-01-15 10:22
 */
public abstract class Pet {
    private String name;
    private int age;

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract public String getOwner();

    public void setSounder(String sounder) {
        System.out.println("The sounder of this pet is " + sounder);
    }
}
