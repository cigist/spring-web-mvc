/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cigist.springwebmvc.controller;

/**
 *
 * @author Irwan Cigist <cigist.developer@gmail.com>
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloJava {
    @RequestMapping(value = "/hello")
    public ModelAndView hello(){
        String myMessage = "Hallo ini dari kelas HelloJava";
        ModelAndView mav = new ModelAndView();
        mav.setViewName("hello");
        mav.addObject("message", myMessage);
        return mav;
    }
}
