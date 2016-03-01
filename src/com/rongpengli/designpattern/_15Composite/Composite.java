package com.rongpengli.designpattern._15Composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
    private List<Component> childrenComponents = null;

    private String name = "";

    public Composite(String name) {
        this.name = name;
    }

    @Override
    public void printStruct(String preStr) {
        System.out.println(preStr + "-" + name);
        if (childrenComponents != null) {
            preStr += " ";
            for (Component c : childrenComponents) {
                c.printStruct(preStr);
            }
        }
    }

    @Override
    public void addChild(Component child) {
        if (childrenComponents == null) {
            childrenComponents = new ArrayList<Component>();
        }
        childrenComponents.add(child);
    }

}
