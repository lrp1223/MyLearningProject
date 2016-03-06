package com.rongpengli.designpattern._20Flyweight;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class SecurityMgr {
    private static SecurityMgr securityMgr = new SecurityMgr();

    private SecurityMgr() {
    }

    public static SecurityMgr getInstance() {
        return securityMgr;
    }

    // 在运行期间，用来存放登录人员对象的权限；在Web应用中，这些数据通常会存放到session中
    private final Map<String, Collection<Flyweight>> map = new HashMap<String, Collection<Flyweight>>();

    public void login(String user) {
        Collection<Flyweight> collection = queryByUser(user);
        map.put(user, collection);
    }

    // 判断某用户对某个安全实体是否拥有某种权限
    public boolean hasPermit(String user, String securityEntity, String permit) {
        Collection<Flyweight> collection = map.get(user);
        if (collection == null || collection.size() == 0) {
            System.out.println(user + "没有登录或是没有被分配任何权限");
            return false;
        }
        for (Flyweight fm : collection) {
            System.out.println("fm==" + fm);
            if (fm.match(securityEntity, permit)) {
                return true;
            }
        }
        return false;
    }

    // 从数据库中获取某人所拥有的权限
    private Collection<Flyweight> queryByUser(String user) {
        Collection<Flyweight> collection = new ArrayList<Flyweight>();
        for (String s : TestDB.colDB) {
            String[] ss = s.split(",");
            if (ss[0].equals(user)) {
                Flyweight fm = FlyweightFactory.getInstance().getFlyweight(ss[1] + "," + ss[2]);
                collection.add(fm);
            }
        }
        return collection;
    }
}
