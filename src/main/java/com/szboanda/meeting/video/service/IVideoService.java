package com.szboanda.meeting.video.service;

import com.szboanda.meeting.video.mode.Video;

public interface IVideoService {

    Video save(Video video);


    Video findById(String id);
}
