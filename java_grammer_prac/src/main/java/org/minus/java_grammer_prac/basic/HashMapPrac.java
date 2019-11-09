package org.minus.java_grammer_prac.basic;

import java.util.HashMap;

/**
 * Created by zhengsihan, on 2019-11-08
 */
public class HashMapPrac {

    /**
     * 思考:load factor, maxSize不对外暴露，是希望使用者不考虑这些细节吗？
     * @param args
     */
    public static void main(String[] args) {
        HashMap map = new HashMap();
        for(int i = 0; i < 17; i++) {
            map.put(i, i);
            System.out.println(map.size());
        }
    }
}
