package com.atfan.calssrelationship;

/**
 * @author fx
 * @create 2021-01-18 10:17
 */
public class Ship implements Vehicle {
    public String name;

    public String runCommunication() {
        return name +"在水中滑行";
    }
}
