package com.itshaala.controller;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;

@Controller
public class GreetingController {

    @RequestMapping(value = "/greet", method = RequestMethod.GET)
    public ModelAndView greet() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("greeting");
        mav.addObject("message", "Good morning ! : " + LocalDateTime.now());
        return mav;
    }
}
