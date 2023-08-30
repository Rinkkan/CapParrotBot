package com.UserOfTheDayBot;

public class UserForBD {
    private final int ID;
    private final String USERNAME;
    private final String FIRST_NAME;
    private int userDayCounter;
    private int loserDayCounter;
    private int ratDayCounter;
    public UserForBD(int id,String username, String firstName) {
        this.ID = id;
        this.USERNAME = username;
        this.FIRST_NAME = firstName;
    }

    public String getName(){
        return USERNAME.equals("null") ? FIRST_NAME : USERNAME;
    }
    public String getNotificationName(){
        return USERNAME.equals("null") ? FIRST_NAME : "@"+ USERNAME;
    }
    public int getID(){
        return ID;
    }
    public void setUserDayCounter(int n){
        userDayCounter = n;
    }
    public int getUserDayCounter(){
        return userDayCounter;
    }

    public int getLoserDayCounter() {
        return loserDayCounter;
    }

    public void setLoserDayCounter(int loserDayCounter) {
        this.loserDayCounter = loserDayCounter;
    }

    public int getRatDayCounter() {
        return ratDayCounter;
    }

    public void setRatDayCounter(int ratDayCounter) {
        this.ratDayCounter = ratDayCounter;
    }

//    @Override
//    public String toString() {
//        return "com.UserOfTheDayBot.UserForBD{" +
//                "ID=" + ID +
//                ", USERNAME='" + USERNAME + '\'' +
//                ", FIRST_NAME='" + FIRST_NAME + '\'' +
//                ", userDayCounter=" + userDayCounter +
//                ", loserDayCounter=" + loserDayCounter +
//                ", ratDayCounter=" + ratDayCounter +    
//                '}';
//    }
}
