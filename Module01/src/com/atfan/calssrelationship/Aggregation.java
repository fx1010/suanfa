package com.atfan.calssrelationship;

import java.io.PrintStream;

/**
 * @author fx
 * @create 2021-01-19 19:31
 */
public class Aggregation {
    /*public static void main(String[] args) {
        BusDriver driver = new BusDriver();
        driver.wearClothes(new Clothes());
        driver.wearHat(new Hat());
        driver.show();
    }*/
}

class Clothes {
    public String name = "工衣";
}

class Hat {
    public String name = "工帽";
}

class BusDriver extends Driver{
    public Clothes clothes;
    public Hat hat;
    /*public void wearClothes(Clothes clothes){
        this.clothes = clothes;
    }

    public void wearHat(Hat hat) {
        this.hat = hat;
    }*/

    public PrintStream show() {
        return System.out.printf("公交车司机穿着%s和%s",this.clothes.name,this.hat.name);
    }
}