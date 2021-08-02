package com.company.io;

import java.io.*;

/**
 * @Author: DongXin
 * @Description:
 * @Date:
 */
public class Filew {
    public static void main(String[] args) {
        FileReader fr=null;
        FileWriter fw=null;
        BufferedReader br=null;
        BufferedWriter bw=null;

        try {
            fr=new FileReader("E:\\Desktop\\idea-work-1.0\\untitled\\src\\com\\company\\io\\Filew.java");
            fw=new FileWriter("E:\\Desktop\\idea-work-1.0\\untitled\\src\\com\\company\\io\\R.txt");

            br=new BufferedReader(fr);
            bw=new BufferedWriter(fw);
             int c=0;
            while ((c=br.read())!=-1){
                bw.write(c);
            }
            bw.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fr.close();
                fw.close();
                br.close();
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }



    }
}
