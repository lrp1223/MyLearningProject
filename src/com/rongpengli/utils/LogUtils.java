package com.rongpengli.utils;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class LogUtils {
    public static void log(String className, String message) {
        Logger logger = Logger.getLogger(className);
        logger.debug(message);

        LogManager.getLogger("");
    }

    public static void main(String[] args) {
        log("A", "test");
    }
}
