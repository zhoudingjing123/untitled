package com.company.cotian;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * @Author: DongXin
 * @Description:
 * @Date:
 */
public class TestHashMap {
    public static void main(String[] args) {
        HashMap<Integer,String> hm=new HashMap<Integer, String>();
        hm.put(101,"鑫鑫");
        hm.put(898,"欢欢");
        hm.put(879,"小米");
        hm.put(654,"小花");
        hm.put(342,"哈士奇");
        //value的值
        Collection<String> ct=hm.values();
        System.out.println("名字是:");
        Iterator<String> it=ct.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        //key的值
        Set<Integer> keys=hm.keySet();
        System.out.println("分数是:");
        Iterator<Integer> it1=keys.iterator();
        while (it1.hasNext()){
            System.out.println(it1.next());
        }
        System.out.println("显示所有的信息:");
        for (Integer key: keys) {
            System.out.println("名称是:"+key+"分数是:"+hm.get(key));
        }

    }
}
