package com.atfan.calssrelationship;

/**
 * @author fx
 * @create 2021-01-20 10:49
 */
public class Association {
    /*public static void main(String[] args) {
        Driver driver = new Driver("jack");
        Car car = new Car("car1");
        driver.addCar(car);
        car.addDriver(driver);
        System.out.println(driver);
    }*/

}

class Driver extends Human{
    private String name;
    public Car car;

    /*public Driver(String name) {
        this.name = name;
    }

    public void addCar(Car car) {
        this.car = car;
    }*/
}
