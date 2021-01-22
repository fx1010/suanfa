package com.atfan.calssrelationship;

import java.util.List;
import java.util.UUID;

/**
 * @author fx
 * @create 2021-01-22 14:57
 */
public class Association1 {
}

class School {
    private List<Student> students;
}

class Student {
    private IdentityCard identityCard;
}

class IdentityCard {
    private String id = UUID.randomUUID().toString();
}