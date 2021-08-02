package com.company;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Author: DongXin
 * @Description:
 * @Date:
 */
public class StringTest {
    public static void main(String[] args) {
        FileInputStream fis=null;
        int i=0;
        try {
            fis=new FileInputStream("E:\\Desktop\\新建文件夹\\hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            i=fis.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        while (i!=-1){
            System.out.print((char)i);
            try {
                i=fis.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
