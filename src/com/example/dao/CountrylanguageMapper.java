package com.example.dao;

import com.example.entity.Countrylanguage;
import com.example.entity.CountrylanguageKey;

public interface CountrylanguageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table countrylanguage
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(CountrylanguageKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table countrylanguage
     *
     * @mbggenerated
     */
    int insert(Countrylanguage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table countrylanguage
     *
     * @mbggenerated
     */
    int insertSelective(Countrylanguage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table countrylanguage
     *
     * @mbggenerated
     */
    Countrylanguage selectByPrimaryKey(CountrylanguageKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table countrylanguage
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Countrylanguage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table countrylanguage
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Countrylanguage record);
}