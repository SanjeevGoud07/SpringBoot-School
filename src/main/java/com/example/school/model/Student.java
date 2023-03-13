// Write your code here
package com.example.school.model;

public class Student{
    private int studentId;
    private String studentName;
    private String gender;
    private int standard;

    public Student(int studentId,String studentName,String gender,int standard){
        this.studentId=studentId;
        this.studentName=studentName;
        this.gender=gender;
        this.standard=standard;
    }

    public int getStudentId(){
        return studentId;
    }
    public int getStandard(){
        return standard;
    }
    public String getStudentName(){
        return studentName;
    }
    public String getGender(){
        return gender;
    }

    public void setStudentId(int id){
        studentId=id;
    }

    public void setStudentName(String name){
        studentName=name;
    }

    public void setGender(String gend){
        gender=gend;
    }
    public void setStandard(int stand){
        standard=stand;
    }

}