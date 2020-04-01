package com.szboanda.meeting.user.cache;

import com.szboanda.meeting.user.mode.User;
import com.szboanda.meeting.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class UserCache {
    public static Map<String, User> userMap = new HashMap<String, User>();

    @Autowired
    private IUserService userService;

    public static boolean auth(String userId) {
        return userMap.containsKey(userId);
    }

    @PostConstruct
    public void init(){
        System.out.println("系统启动中。。。加载userMap");
        List<User> userList = userService.findAll();
        if(userList != null && !userList.isEmpty()){
            for (User user : userList) {
                userMap.put(user.getUserId(), user);
            }
        }

    }

    @PreDestroy
    public void destroy(){
        System.out.println("系统运行结束");
    }
}
