package com.szboanda.meeting.controller;

import com.szboanda.meeting.utils.MapUtils;
import com.xylink.model.MeetingInfo;
import com.xylink.model.ReminderMeeting;
import com.xylink.model.SdkCloudMeetingRoomRequest;
import com.xylink.model.SdkMeeting;
import com.xylink.sdk.conferenceControl.CreateMeetingApi;
import com.xylink.sdk.dating.ScheduleMeetingApi;
import com.xylink.util.Result;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


@Controller
public class MeetManagerController {

    public static final String enterpriseId =  "";
    public static final String token =  "";

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index()  {
        return "index";
    }

    @RequestMapping("/test")
    @ResponseBody
    public String test(HttpServletRequest request)  {
        return "test";
    }

    @RequestMapping({"/create"})
    @ResponseBody
    public Map<String, Object> addMeet(@RequestBody Map<String, Object> paramsMap) {
        Map<String, Object> result = new HashMap();
        CreateMeetingApi meetingApi = new CreateMeetingApi();
        SdkCloudMeetingRoomRequest request = new SdkCloudMeetingRoomRequest();
        request.setMeetingName(MapUtils.getString(paramsMap,"meetingName"));
        request.setStartTime( MapUtils.getLong(paramsMap,"startTime"));
        request.setEndTime( MapUtils.getLong(paramsMap,"endTime"));
        request.setMaxParticipant(MapUtils.getInt(paramsMap,"maxParticipant"));

        String password = MapUtils.getString(paramsMap, "password");
        if(!StringUtils.isEmpty(password)){
            request.setRequirePassword(true);
            request.setPassword(password);
        }
        request.setControlPassword(MapUtils.getString(paramsMap,"controlPassword"));
        request.setAutoMute(MapUtils.getInt(paramsMap,"autoMute"));
        request.setConfigs(null);
        result.put("meetinginfo", paramsMap);
//            SdkMeeting meetingV2 = meetingApi.createMeetingV2(enterpriseId, token, request);
        return result;
    }

    @RequestMapping({"/getMeetingInfo"})
    @ResponseBody
    public Map<String, Object> getMeetingInfo(@RequestBody Map<String, Object> paramsMap)  {
        Map<String, Object> result = new HashMap();
        try {
            CreateMeetingApi meetingApi = new CreateMeetingApi();
            String roomNumber = MapUtils.getString(paramsMap,"meetingRoomNumber");
            Result<MeetingInfo> meetingInfo = meetingApi.getMeetingInfo(enterpriseId, token, roomNumber);
            result.put("meetinginfo", meetingInfo);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    @RequestMapping({"/update"})
    @ResponseBody
    public Map<String, Object> update(@RequestBody Map<String, Object> paramsMap) {
        Map<String, Object> result = new HashMap();
        try {
            CreateMeetingApi meetingApi = new CreateMeetingApi();
            String roomNumber = MapUtils.getString(paramsMap,"");
            MeetingInfo meetingInfo = new MeetingInfo();
            meetingInfo.setMeettingRoomName(MapUtils.getString(paramsMap,"meetingName"));

            String password = MapUtils.getString(paramsMap, "password");
            if(!StringUtils.isEmpty(password)){
                meetingInfo.setPassword(password);
            }
            meetingInfo.setAutoMute(MapUtils.getInt(paramsMap,"autoMute"));
            Result updateMeetingInfo = meetingApi.updateMeetingInfo(enterpriseId, token, roomNumber, meetingInfo);
            result.put("meetinginfo", updateMeetingInfo);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    @RequestMapping({"/delete"})
    @ResponseBody
    public Map<String, Object> delete(@RequestBody Map<String, Object> paramsMap)  {
        Map<String, Object> result = new HashMap();
        try {
            CreateMeetingApi meetingApi = new CreateMeetingApi();
            String roomNumber = MapUtils.getString(paramsMap,"");
            Result<MeetingInfo> meetingInfo = meetingApi.deleteMeetingInfo(enterpriseId, token, roomNumber);
            result.put("meetinginfo", meetingInfo);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    @RequestMapping({"/reminder"})
    @ResponseBody
    public Map<String, Object> reminder(@RequestBody Map<String, Object> paramsMap) {
        Map<String, Object> result = new HashMap();
        try {
            ScheduleMeetingApi meetingApi = new ScheduleMeetingApi();
            ReminderMeeting meeting = new ReminderMeeting();
            meeting.setId(enterpriseId);
            meeting.setTitle(MapUtils.getString(paramsMap,"title"));
            meeting.setStartTime((long) MapUtils.getFloat(paramsMap,"startTime"));
            meeting.setEndTime((long) MapUtils.getFloat(paramsMap,"endTime"));
            meeting.setAddress(MapUtils.getString(paramsMap,"address"));
            meeting.setDetails(MapUtils.getString(paramsMap,"details"));
            meeting.setPassword(MapUtils.getString(paramsMap,"password"));
            meeting.setMeetingRoomType(1);//随机生成云会议号
            Result<MeetingInfo> meetingInfo = meetingApi.remindMeeting(enterpriseId, token, meeting);
            result.put("meetinginfo", meetingInfo);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    @RequestMapping({"/reminderUpdate"})
    @ResponseBody
    public Map<String, Object> reminderUpdate(@RequestBody Map<String, Object> paramsMap)  {
        Map<String, Object> result = new HashMap();
        try {
            ScheduleMeetingApi meetingApi = new ScheduleMeetingApi();
            String meetingId = MapUtils.getString(paramsMap, "meetingId");
            ReminderMeeting meeting = new ReminderMeeting();
            meeting.setTitle(MapUtils.getString(paramsMap,"title"));
            meeting.setStartTime((long) MapUtils.getFloat(paramsMap,"startTime"));
            meeting.setEndTime((long) MapUtils.getFloat(paramsMap,"endTime"));
            meeting.setAddress(MapUtils.getString(paramsMap,"address"));
            meeting.setDetails(MapUtils.getString(paramsMap,"details"));
            meeting.setPassword(MapUtils.getString(paramsMap,"password"));
            meeting.setMeetingRoomType(1);//随机生成云会议号
            Result<MeetingInfo> meetingInfo = meetingApi.updateMeeting(enterpriseId, token, meetingId,meeting);
            result.put("meetinginfo", meetingInfo);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    @RequestMapping({"/reminderDelete"})
    @ResponseBody
    public Map<String, Object> reminderDelete(@RequestBody Map<String, Object> paramsMap)  {
        Map<String, Object> result = new HashMap();
        try {
            ScheduleMeetingApi meetingApi = new ScheduleMeetingApi();
            String meetingId = MapUtils.getString(paramsMap, "meetingId");
            Result<MeetingInfo> meetingInfo = meetingApi.deleteMeeting(enterpriseId, token, meetingId);
            result.put("meetinginfo", meetingInfo);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    @RequestMapping({"/reminderQuery"})
    @ResponseBody
    public Map<String, Object> reminderQuery(@RequestBody Map<String, Object> paramsMap)  {
        Map<String, Object> result = new HashMap();
        try {
            ScheduleMeetingApi meetingApi = new ScheduleMeetingApi();
            String meetingId = MapUtils.getString(paramsMap, "meetingId");
            Result<ReminderMeeting[]> meetingInfo = meetingApi.getAllMeeting(enterpriseId, token, 0L);
            result.put("meetinginfo", meetingInfo);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

}