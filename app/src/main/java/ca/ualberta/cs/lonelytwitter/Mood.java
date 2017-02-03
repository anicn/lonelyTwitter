package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by anicn on 2017-01-19.
 */

/**
 * Allows user to input a mood as a string
 */
public abstract class Mood {

    private Date date;
    private String mood;

    public Mood(String mood){
        this.date = new Date();
        this.mood = mood;
    }

    public Mood(Date date, String mood) {
        this.date = date;
        this.mood = mood;
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public abstract String mood();
}
