package com.example.entity;

public class CountrylanguageKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column countrylanguage.CountryCode
     *
     * @mbggenerated
     */
    private String countrycode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column countrylanguage.Language
     *
     * @mbggenerated
     */
    private String language;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column countrylanguage.CountryCode
     *
     * @return the value of countrylanguage.CountryCode
     *
     * @mbggenerated
     */
    public String getCountrycode() {
        return countrycode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column countrylanguage.CountryCode
     *
     * @param countrycode the value for countrylanguage.CountryCode
     *
     * @mbggenerated
     */
    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode == null ? null : countrycode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column countrylanguage.Language
     *
     * @return the value of countrylanguage.Language
     *
     * @mbggenerated
     */
    public String getLanguage() {
        return language;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column countrylanguage.Language
     *
     * @param language the value for countrylanguage.Language
     *
     * @mbggenerated
     */
    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }
}