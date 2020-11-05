package net.xdclass.demoproject1.controller;

import net.xdclass.demoproject1.domain.Video;
import net.xdclass.demoproject1.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 视频控制器
 */
@RestController
@RequestMapping("/api/vl/video")
public class VideoController {

    @Autowired
    private VideoService videoService;
    /**
     * 返回json对象
     * @return
     */
    //@RequestMapping(value = "list",method = RequestMethod.GET)
    @GetMapping("list")
    //@PostMapping("list")
    public Object list(){
//        Map<String ,String > map = new HashMap<>();
//        map.put("1","面试专题课程");
//        map.put("2","spring cloud 微服务课程");
        List<Video> listVideo = videoService.listVideo();

        return listVideo;
    }


}
