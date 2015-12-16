package com.rongpengli.test.jsontest;

import java.util.List;

import com.google.gson.Gson;

public class JSONTest {
    public static String lTest = "{\"name\" : \"lrp\" ,\"age\" : 20, \"detail\": [{\"name\": \"ljj\"}] }";

    public static void main(String[] args) {
        Gson lGson = new Gson();
        Person lPerson = lGson.fromJson(lTest, Person.class);
        System.out.println(lPerson.age);
        System.out.println(lPerson.detail.get(0).name);
    }
}

class Person {
    String name;
    String age;
    List<PP1> detail;
}

class PP1 {
    String name;
}
