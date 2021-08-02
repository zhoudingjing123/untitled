package com.company.object;

import java.io.*;

/**
 * @Author: DongXin
 * @Description:
 * @Date:
 */
public class objectw {
    public static void main(String[] args) {
        FileOutputStream fos=null;
        FileInputStream fis=null;

        ObjectOutputStream oos=null;
        ObjectInputStream ois=null;

        try {
            fos=new FileOutputStream("E:\\Desktop\\hello.txt");
            oos=new ObjectOutputStream(fos);
            object s=new object();
            s.setName("馨儿");
            s.setAddress("深圳市南山区");
            s.setSex("男");

            object s1=new object();
            s1.setName("静静");
            s1.setAddress("深圳市南山区茶光");
            s1.setSex("女");
            oos.writeObject(s);
            oos.writeObject(s1);
            System.out.println("写入对象成功");
            fis=new FileInputStream("E:\\Desktop\\hello.txt");
            ois=new ObjectInputStream(fis);

            object s1_1=(object)ois.readObject();
            object s1_2=(object)ois.readObject();
            System.out.println("原始的数据"+s);
            System.out.println("现在的数据"+s1_1);
            System.out.println("原始的数据"+s1);
            System.out.println("现在的数据"+s1_2);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
                oos.close();

                fis.close();
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
}
