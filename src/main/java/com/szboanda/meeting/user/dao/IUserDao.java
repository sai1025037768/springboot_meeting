package com.szboanda.meeting.user.dao;

import com.szboanda.meeting.user.mode.User;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface IUserDao extends JpaRepository<User, Integer> {
}
