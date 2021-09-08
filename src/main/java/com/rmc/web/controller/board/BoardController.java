package com.rmc.web.controller.board;

import com.rmc.web.config.auth.PrincipalDetail;
import com.rmc.web.model.bike.Mybike;
import com.rmc.web.model.user.User;
import com.rmc.web.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class BoardController {

    @Autowired
    private BoardService boardService;

    @GetMapping("/board/write")
    public String writeForm(Model model, @AuthenticationPrincipal PrincipalDetail principal){
        User user= principal.getUser();
        model.addAttribute("bikeList",boardService.selectMyBike(user));
        return "board/boardWrite";
    }

}
