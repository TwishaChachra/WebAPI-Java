package com.example.midterm200474646;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Student {
private int studentNum;
private String firstName,lastName;
private String gender;
private int telephone;
private String province;
private int avgGrade;
private String majorCode;

    public Student(int studentNum, String firstName, String lastName, String gender, int telephone, String province, int avgGrade, String majorCode) {
        setStudentNum(studentNum);
        setFirstName(firstName);
       setLastName(lastName);
       setGender(gender);
       setTelephone(telephone);
       setProvince(province);
       setAvgGrade(avgGrade);
       setMajorCode(majorCode);



    }

    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int studentNum) {
        if(studentNum >= 200034000 && studentNum <= 200070000)
        this.studentNum = studentNum;
        else
            throw new IllegalArgumentException("Student number is invalid. Please enter a value between 200034000 and 200070000");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if(firstName.length()>1)
            this.firstName = firstName;
        else
            throw new IllegalArgumentException("Value of First Name needs to be more than one character.");

    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(lastName.length()>1)
        this.lastName = lastName;
        else
            throw new IllegalArgumentException("Value of Last Name needs to be more than one character.");
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }
    public static List<String> getProvinceList()
    {
        List<String> provinceList =  Arrays.asList("AB","BC","MB","NB","NL","NS","NT","NU","ON","PE","QC","SK","YT" );
        Collections.sort(provinceList);
        return provinceList;
    }
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
        List<String> provinceList = getProvinceList();
        if (provinceList.contains(province))
            this.province = province;
        else
            throw new IllegalArgumentException(province + " is invalid, choose from " + provinceList);
    }

    public int getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(int avgGrade) {
        if(avgGrade >= 0 && avgGrade <=100)
        this.avgGrade = avgGrade;
        else
            throw new IllegalArgumentException("The value is invalid. Please choose a number from 0 to 100.");
    }

    public String getMajorCode() {
        return majorCode;
    }

    public void setMajorCode(String majorCode) {
        if(majorCode.equals(majorCode.toUpperCase()) )
        this.majorCode = majorCode;
    }
}
