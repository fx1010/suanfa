package com.atfan.calssrelationship;

/**
 * @author fx
 * @create 2021-01-16 23:33
 */
class Car {
    public String name="1";
    public void ruanCar(){
    }
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

public class Generalization {
    public static void main(String[] args) {
        Bus bus = new Bus();
        Taxi taxi = new Taxi();
        bus.ruanCar();
        taxi.ruanCar();
    }
}
