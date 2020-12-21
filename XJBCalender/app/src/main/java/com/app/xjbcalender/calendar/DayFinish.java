package com.app.xjbcalender.calendar;



public class DayFinish{
    public int day;
    public String lunar;
    boolean IsFestival;
    DayFinish(int day,String lunar,boolean IsFestival) {
        this.day = day;
        this.lunar = lunar;
        this.IsFestival = IsFestival;
    }
}
