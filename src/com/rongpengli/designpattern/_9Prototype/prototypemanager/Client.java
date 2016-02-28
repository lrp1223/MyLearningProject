package com.rongpengli.designpattern._9Prototype.prototypemanager;

public class Client {

    public static void main(String[] args) {
        try {
            Prototype p1 = new ConcretePrototype1();
            PrototypeManager.setPrototype("prototype1", p1);

            Prototype p3 = PrototypeManager.getPrototype("prototype1").clone();
            p3.setName("张三");
            System.out.println("第一个实例：" + p3);

            Prototype p2 = new ConcretePrototype2();
            PrototypeManager.setPrototype("prototype2", p2);

            Prototype p4 = PrototypeManager.getPrototype("prototype2").clone();
            p4.setName("李四");
            System.out.println("第二个实例：" + p4);

            PrototypeManager.removePrototype("prototype1");

            Prototype p5 = PrototypeManager.getPrototype("prototype1").clone();
            p5.setName("王五");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
