package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author: DongXin
 * @Description:
 * @Date:
 */
public class Output {
    public static void main(String[] args) {
        String s="sjdfhwiunvjdbvsvnkldjgurejnvhskbbvdkhgfkyrd";
        FileOutputStream fie=null;
        FileOutputStream fie1=null;

        File f=new File("E:\\Desktop\\新建文件夹\\F.txt");
        File f1=new File("E:\\Desktop\\新建文件夹\\F1.txt");

        if (!f.exists()){
            try {
                f.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (!f1.exists()){
            try {
                f.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
           byte[] b=s.getBytes();
            try {
                fie=new FileOutputStream(b.toString());
                fie1=new FileOutputStream(b.toString());
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

        }

















    }
}
