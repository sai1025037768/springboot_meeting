package com.szboanda.meeting.user.service.impl;

import com.szboanda.meeting.user.dao.IUserDao;
import com.szboanda.meeting.user.mode.User;
import com.szboanda.meeting.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("UserServiceImpl")
public class UserServiceImpl implements IUserService {

    @Autowired
    IUserDao userDao;

    public List<User>  findAll(){
        return userDao.findAll();
    }
}
