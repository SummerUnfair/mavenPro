package com;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HellloWord {
    private static final Logger logger = LoggerFactory.getLogger(HellloWord.class);
    public static void main (String[] args)
    {
//        String a = args[0];
//        System.out.println(a+"run with jar");
            logger.info("正常执行..");
            System.out.println("ferao success..");
            logger.info("");
    }
}
