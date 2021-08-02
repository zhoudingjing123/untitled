package com.company.cotian;

import java.util.Set;
import java.util.TreeMap;

/**
 * @Author: DongXin
 * @Description:
 * @Date:
 */
public class TestTree {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
        tm.put(98, "欢欢");
        tm.put(78, "小花");
        tm.put(890, "小狗");
        tm.put(1, "毛毛");
        tm.put(34, "黑熊");
        Set<Integer> st = tm.keySet();
        for (Integer key : st) {
            System.out.println("姓名是：" + key + "学号是：" + tm.get(key));
        }

        class teach implements Comparable{

            private String name;
            private Integer age;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public Integer getAge() {
                return age;
            }

            public void setAge(Integer age) {
                this.age = age;
            }

            @Override
            public int compareTo(Object o) {
                if(!(o instanceof teach)){
                 return 1;
                }
                teach t=(teach)o;
                return this.age-getAge();
            }
        }

    }
}
