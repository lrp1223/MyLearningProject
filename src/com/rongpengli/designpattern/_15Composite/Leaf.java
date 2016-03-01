package com.rongpengli.designpattern._15Composite;

public class Leaf extends Component {
    // 叶子对象的名字
    public String name = "";

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void printStruct(String preStr) {
        System.out.println(preStr + "-" + name);
    }

}
