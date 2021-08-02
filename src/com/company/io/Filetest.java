package com.company.io;

import java.io.File;

/**
 * @Author: DongXin
 * @Description:
 * @Date:
 */
public class Filetest {
    public static void main(String[] args) {
        File f=new File("E:\\Desktop\\idea-work-1.0");
        File[] fe=f.listFiles();

        for (File file:fe) {
            System.out.println(file.getName());
            System.out.println(file.getPath());
            System.out.println(file.isFile());
            System.out.println(file.isDirectory());
        }

    }
}
