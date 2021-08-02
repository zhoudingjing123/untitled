package com.company.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Author: DongXin
 * @Description:
 * @Date:
 */
public class inputStream {
    public static void main(String[] args) {
        FileInputStream fileInputStream=null;
        int i=0;
        try {
            fileInputStream=new FileInputStream("E:\\Desktop\\新建文件夹\\hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            i=fileInputStream.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        while (i!=-1){
            System.out.print((char)i);
            try {
                i=fileInputStream.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
