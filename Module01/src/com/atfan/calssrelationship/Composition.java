package com.atfan.calssrelationship;

/**
 * @author fx
 * @create 2021-01-18 12:23
 */
public class Composition {

}

class Head {
    public String name="头部";
}

class Body {
    public String name = "身体";
}

class Human {
    public Head head;
    public Body body;

    /*public Human() {
        this.head = new Head();
        this.body = new Body();
    }*/

    /*public void setBody(Body body) {
        this.body = body;
    }

    public void setHead(Head head) {
        this.head = head;
    }*/
}