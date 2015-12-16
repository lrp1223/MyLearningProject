package com.rongpengli.test;

public class Test2 {
    public void fun(Object[] iObj) {
        for (int i = 0; i < iObj.length; i++) {
            System.err.println(iObj[i]);
        }
    }

    public static void main(String[] args) {
        Test2 lTest2 = new Test2();
        Object[] lObj = new Object[] { Status.Init.getValue(), Status.Processing.getValue() };
        lTest2.fun(lObj);
    }

    public enum Status {
        Init((short) 0), Processing((short) 1);
        private Status(short iValue) {
            mValue = iValue;
        }

        public short getValue() {
            return mValue;
        }

        short mValue;
    }
}
