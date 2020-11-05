package net.xdclass.demoproject1.mapper;

import net.xdclass.demoproject1.domain.Video;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 *dddddddddddd
 */
@Repository
public class VideoMapper {

    private  static Map<Integer, Video> videoMap = new HashMap<>();

    static {
        videoMap.put(1,new Video(1,"Java基础课程","Java基础课程",10));
        videoMap.put(2,new Video(2,"Mabits基础课程","Spring基础课程",20));
        videoMap.put(3,new Video(3,"Spring基础课程","Spring基础课程",30));
        videoMap.put(4,new Video(4,"Spring Boot基础课程","Spring Boot基础课程",40));
        videoMap.put(5,new Video(5,"MySQL基础课程","MySQL基础课程",50));

    }

    public List<Video> listVideo(){
        List<Video> list = new ArrayList<>();
        list.addAll(videoMap.values());
        return list;
    }
}
