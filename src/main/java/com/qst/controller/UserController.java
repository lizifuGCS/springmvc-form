package com.qst.controller;

import com.qst.bean.HobbyCollection;
import com.qst.bean.OriginCollection;
import com.qst.bean.PostsCollection;
import com.qst.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class UserController{

    @RequestMapping("/login")
    public  String userShowPage(Model model){
        User user = new User();
        user.setUsername("小明");
        user.setPassword("123");
        user.setDescription("我是最帅的！");
        user.setSex("女");

        user.setOrigin(1);

        List<String>  myHobbies = new ArrayList<String>();
        myHobbies.add("睡觉");
        myHobbies.add("吃饭");
        user.setMyHobbies(myHobbies);

       List<Integer> posts =new ArrayList<Integer>();
        posts.add(1);
        posts.add(2);
        posts.add(4);
        user.setPosts(posts);





        model.addAttribute("userInfo",user);
        model.addAttribute("hobbyCollection",HobbyCollection.hobbies);
        model.addAttribute("postsCollection", PostsCollection.posts);
        model.addAttribute("originCollection", OriginCollection.origin);
        return "showUser";




    }

}