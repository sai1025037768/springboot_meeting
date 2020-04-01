package com.szboanda.meeting.video.controller;

import com.szboanda.meeting.utils.MapUtils;
import com.szboanda.meeting.video.mode.Video;
import com.szboanda.meeting.video.service.IVideoService;
import com.xylink.model.SdkCloudMeetingRoomRequest;
import com.xylink.sdk.conferenceControl.CreateMeetingApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Controller
@RequestMapping("/video")
public class VideoController {

    @Autowired
    IVideoService videoService;


    @RequestMapping({"/upload"})
    @ResponseBody
    public Map<String, Object> upload(HttpServletRequest request, @RequestParam("data") MultipartFile file) {
        Map<String, Object> result = new HashMap();
//System.out.println("进入后台成功");
        String pathName = "D:/OTA/";//想要存储文件的地址
        String pname = file.getOriginalFilename();//获取文件名（包括后缀）
        pathName += pname;
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(pathName);
            fos.write(file.getBytes()); // 写入文件

            Video video = saveToDataBase(pathName);

            String path =
                   "http://" +  request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + video.getPath();
            video.setPath(path);

            result.put("status", "1");
            result.put("message", "文件上传成功");
            result.put("data", video);
        } catch (Exception e) {
            e.printStackTrace();
            result.put("status", "0");
            result.put("message", "文件上传失败");
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    @RequestMapping({"/query"})
    @ResponseBody
    public Map<String, Object> query(HttpServletRequest request, @RequestBody Map<String, Object> paramsMap) {
        Map<String, Object> result = new HashMap();
        String xh = MapUtils.getString(paramsMap, "XH");
        Video video = videoService.findById(xh);
        String path =
                "http://" +  request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + video.getPath();
        video.setPath(path);

        result.put("status", "1");
        result.put("message", "文件查询成功");
        result.put("data", video);
        return result;
    }


    private Video saveToDataBase(String pathName) {
        Video video = new Video();
        String xh = UUID.randomUUID().toString();
        video.setXh(xh);
        if(pathName.startsWith("D:")){
            pathName= pathName.replace("D:", "");
        }
        video.setPath(pathName);
        video.setCjsj(new Date(System.currentTimeMillis()));

        return videoService.save(video);

    }
}
