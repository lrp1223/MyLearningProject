package com.rongpengli.designpattern._21Interpreter;

import java.util.ArrayList;
import java.util.Collection;

import org.w3c.dom.Element;

public class ElementExpression extends ReadXmlExpression {
    private final Collection<ReadXmlExpression> eles = new ArrayList<ReadXmlExpression>();

    private String eleName = "";

    public ElementExpression(String eleName) {
        this.eleName = eleName;
    }

    public boolean addEle(ReadXmlExpression ele) {
        eles.add(ele);
        return true;
    }

    public boolean removeEle(ReadXmlExpression ele) {
        eles.remove(ele);
        return true;
    }

    @Override
    public String[] interpret(Context c) {
        Element pEle = c.getPreEle();
        if (pEle == null) {
            c.setPreEle(c.getDocument().getDocumentElement());
        } else {
            Element nowEle = c.getNowEle(pEle, eleName);
            c.setPreEle(nowEle);
        }

        String[] ss = null;
        for (ReadXmlExpression ele : eles) {
            ss = ele.interpret(c);
        }
        return ss;
    }

}
