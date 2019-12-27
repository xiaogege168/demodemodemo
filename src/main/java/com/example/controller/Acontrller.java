package com.example.controller;

import com.example.entity.City;
import com.example.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class Acontrller {
    @Autowired
    CityService cityService;



    @ResponseBody
    @RequestMapping("/come")
    public String come(){
        return  "ok";
    }


    @RequestMapping("/go")
    public ModelAndView go(){

        ModelAndView mv= new ModelAndView("/aaa");
        List<City> list = cityService.findAll();
        mv.getModel().put("a",list);

        return  mv;
    }

    @RequestMapping("/ccc")
    public String ccc(){
        return  "ok";
    }
}
