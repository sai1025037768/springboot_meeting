package com.szboanda.meeting.video.service.impl;

import com.szboanda.meeting.video.dao.IVideoDao;
import com.szboanda.meeting.video.mode.Video;
import com.szboanda.meeting.video.service.IVideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("VideoServiceImpl")
public class VideoServiceImpl implements IVideoService {

    @Autowired
    IVideoDao videoDao;

    @Override
    public Video save(Video video) {
        return videoDao.save(video);
    }

    @Override
    public Video findById(String id) {
        return videoDao.findById(id).get();
    }
}
