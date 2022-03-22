package com.tms.task1;

import java.io.File;

public class Main {
    private final static File path = new File("D:\\JAVA");

    public static void main(String[] args) {
        getInfo(path);
    }

    public static void getInfo(File path) {
        if (path.isDirectory()) {
            System.out.println(path.getParent() + "\\" + path.getName() + "\\");
            System.out.println("--->");
            for (File file : path.listFiles()) {
                if (file.isFile()) {
                    System.out.println(file.getName());
                }
                getInfo(file);
            }
        }
    }
}


