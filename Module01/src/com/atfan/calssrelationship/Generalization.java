package com.atfan.calssrelationship;

/**
 * @author fx
 * @create 2021-01-16 23:33
 */
/*public class Generalization {
    public static void main(String[] args) {
        Bus bus = new Bus();
        Taxi taxi = new Taxi();
        System.out.println(bus.ruanCar());
        taxi.ruanCar();
    }
}*/

class Car implements Vehicle {
    public String name;
    public Driver driver;

    /*public Car() {
    }

    public Car(String name) {
        this.name = name;
    }*/

    public String beforRun(Oil oil) {
        return "添加" + oil.add();
    }

    public String runCommunication() {
        return name + "在行驶中";
    }

    /*public void addDriver(Driver driver) {
        this.driver = driver;
    }*/
}

class Bus extends Car {
    public Bus() {
        this.name = "公交车";
    }
}

class Taxi extends Car {
    public Taxi() {
        this.name = "出租车";
    }

}

class Oil {
    private String type = "汽油";

    public String add() {
        return this.type;
    }
}


