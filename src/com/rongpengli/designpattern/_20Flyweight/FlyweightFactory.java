package com.rongpengli.designpattern._20Flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private static FlyweightFactory factory = new FlyweightFactory();

    private FlyweightFactory() {
    }

    public static FlyweightFactory getInstance() {
        return factory;
    }

    // 缓存多个Flyweight的对象
    private final Map<String, Flyweight> fsMap = new HashMap<String, Flyweight>();

    public Flyweight getFlyweight(String key) {
        Flyweight flyweight = fsMap.get(key);
        if (flyweight == null) {
            flyweight = new AuthorizationFlyweight(key);
            fsMap.put(key, flyweight);
        }
        return flyweight;
    }
}
