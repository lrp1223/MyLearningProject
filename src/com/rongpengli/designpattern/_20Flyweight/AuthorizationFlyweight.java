package com.rongpengli.designpattern._20Flyweight;

public class AuthorizationFlyweight implements Flyweight {
    // 安全实体
    private final String securityEntity;
    // 权限
    private final String permit;

    public AuthorizationFlyweight(String state) {
        String ss[] = state.split(",");
        securityEntity = ss[0];
        permit = ss[1];
    }

    public String getSecurityEntity() {
        return securityEntity;
    }

    public String getPermit() {
        return permit;
    }

    @Override
    public boolean match(String securityEntity, String permit) {
        if (this.securityEntity.equals(securityEntity) && this.permit.equals(permit)) {
            return true;
        }
        return false;
    }

}
