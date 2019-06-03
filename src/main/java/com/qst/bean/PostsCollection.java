package com.qst.bean;

import java.util.HashMap;
import java.util.Map;

public class PostsCollection {
    public static Map<Integer,Object> posts = new HashMap<Integer,Object>();
    static {
        posts.put(1,"攻城狮");
        posts.put(2,"项目经理");
        posts.put(3,"老师");
        posts.put(4,"工人");
        posts.put(5,"教授");

    }
}
