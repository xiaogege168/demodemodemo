package com.example.service;

import com.example.dao.CityMapper;
import com.example.entity.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {

    @Autowired
    CityMapper cityMapper;

    public City selectByPrimaryKey(){
//        List<User> li= userMapper.selectByPrimaryKey(1);
        City city= cityMapper.selectByPrimaryKey(1);
        return  city;
    }


    public List<City>  findAll(){
        List<City>  li= cityMapper.selectAll();
        return  li;
    }

}
