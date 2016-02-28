package com.rongpengli.designpattern._11Proxy;

import java.util.ArrayList;
import java.util.Collection;

public class UserManager {
    public Collection<UserModelApi> getUserByDepId(String depId) {
        Collection<UserModelApi> collection = new ArrayList<UserModelApi>();

        Proxy proxy = new Proxy(new UserModel());
        proxy.setUserId("");
        proxy.setName("");
        collection.add(proxy);

        return collection;
    }
}
