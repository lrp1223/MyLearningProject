package com.rongpengli.designpattern._20Flyweight;

/**
 * 描述授权数据的享元接口
 *
 * @author rongpengli
 *
 */
public interface Flyweight {
    // 判断传入的安全实体和权限，是否和享元对象内部状态匹配
    public boolean match(String securityEntity, String permit);
}
