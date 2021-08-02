package com.company.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author: DongXin
 * @Description:
 * @Date:
 */
public class OutputStream {
    public static void main(String[] args) {
        String s="sfhuhktsqadhjmnbczdgjkpoudschj";
        FileOutputStream file=null;
        FileOutputStream file1=null;

        File f1=new File("E:\\Desktop\\新建文件夹\\t.txt");
        File f2=new File("E:\\Desktop\\新建文件夹\\t1.txt");

        if (!f1.exists()){
            try {
                f1.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (!f2.exists()){
            try {
                f2.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            file=new FileOutputStream(f1);
            file1=new FileOutputStream(f2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        byte[] b=s.getBytes();
        try {
            file.write(b);
            file1.write(b);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (file!=null){
                    file.close();
                }
              if (file1!=null){
                  file1.close();
              }

            } catch (IOException e) {
                e.printStackTrace();
            }


        }



    }
}
