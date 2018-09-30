package com.jd.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HelloWorld {
    /**
     * 多行注释
     *
     * @param args
     */

    private static final int INITIAL_SIZE = 10;

    public static void main(String[] args) {
        System.out.println("helloworld!");

        System.out.println("helloworld!");


        List<String> list = new ArrayList<String>();
//        synchronized ()

        Date date = new Date();

        method();
    }

    public static void method(){

        try {
            FileInputStream fis = new FileInputStream(new File("hello.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
