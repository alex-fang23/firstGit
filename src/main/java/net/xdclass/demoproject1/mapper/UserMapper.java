package net.xdclass.demoproject1.mapper;

import net.xdclass.demoproject1.domain.User;

import java.util.HashMap;
import java.util.Map;

public class UserMapper {

    private static Map<Integer, User> userMap = new HashMap<>();

    static {
        userMap.put(1,new User( 1,"test1","123"));
        userMap.put(1,new User( 2,"test2","234"));
        userMap.put(1,new User( 1,"test3","345"));

    }
}
