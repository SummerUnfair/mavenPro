package com;


import org.apache.log4j.Logger;

public class LogTest {

    public static void main (String[] args)
    {
        Logger logger = Logger.getLogger(LogTest.class);
        logger.debug("debug message !");
        logger.info("info message !");
    }

}
