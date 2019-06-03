package com.qst.bean;

import java.util.HashMap;
import java.util.Map;

public class OriginCollection {
    public static Map<Integer,String> origin = new HashMap<Integer,String>();
    static {
        origin.put(1,"北京");
        origin.put(2,"上海");
        origin.put(3,"南京");
    }
}
