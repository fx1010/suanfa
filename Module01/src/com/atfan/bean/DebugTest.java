package com.atfan.bean;

import java.util.HashMap;

/**
 * @author fx
 * @create 2021-01-13 15:56
 */
public class DebugTest {
    public static void main(String[] args) {
        // 条件断点
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
        HashMap<String, String> map = new HashMap<>();
        map.put("name", "Tom");
        map.put("age", "12");
        map.put("school", "Tsinghua");
        map.put("major", "computer");

        String age = map.get("age");
        System.out.println("age = " + age);

        map.remove("major");
        System.out.println(map);
    }
}
