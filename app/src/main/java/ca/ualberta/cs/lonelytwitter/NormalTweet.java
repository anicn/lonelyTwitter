package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by anicn on 2017-01-19.
 */

/**
 * NormalTweet extends Tweet
 */

public class NormalTweet extends Tweet {
    public NormalTweet(String message){
        super(message);
    }

    public NormalTweet(Date date, String message) {
        super(date, message);
    }

    @Override
    public Boolean isImportant(){
        return false;
    }
}
