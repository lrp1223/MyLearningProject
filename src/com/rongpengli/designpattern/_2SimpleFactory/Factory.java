package com.rongpengli.designpattern._2SimpleFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Factory {
    public static Api createApi(int condition) {
        Api api = null;

        if (condition == 1) {
            api = new ImplA();
        } else if (condition == 2) {
            api = new ImplB();
        }

        return api;
    }

    public static Api createApi2() {
        Properties properties = new Properties();
        InputStream inputStream = null;

        try {
            inputStream = Factory.class.getResourceAsStream("FactoryTest.properties");
            properties.load(inputStream);
        } catch (Exception e) {
            System.out.println("Failed to load properties file, the detail is:");
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        Api api = null;
        try {
            api = (Api) Class.forName(properties.getProperty("ImplClass")).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return api;
    }
}
