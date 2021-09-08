package com.rmc.web.service;

import com.rmc.web.model.bike.Mybike;
import com.rmc.web.model.user.User;
import com.rmc.web.repository.BoardRepository;
import com.rmc.web.repository.MybikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;

    @Autowired
    private MybikeRepository mybikeRepository;

    @Transactional
    public List<Mybike> selectMyBike(User user){
        List<Mybike> list = mybikeRepository.findAllByUserId(user.getId());
        return list;
    }

}
