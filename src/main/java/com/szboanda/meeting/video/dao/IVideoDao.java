package com.szboanda.meeting.video.dao;

import com.szboanda.meeting.video.mode.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface IVideoDao extends JpaRepository<Video, String> {


}
