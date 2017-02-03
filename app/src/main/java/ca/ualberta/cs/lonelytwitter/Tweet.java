package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by anicn on 2017-01-19.
 */

/**
 * Class that represents a tweet as a string
 */

public abstract class Tweet implements Tweetable{
    private Date date;
    private String message;

    /**
     * tweet message as a string
     * @param message
     */
    public Tweet(String message){

        this.message = message;
        this.date = new Date();
    }

    /**
     * tweet message as string and date
     * @param date
     * @param message
     */
    public Tweet(Date date, String message) {
        this.message = message;
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    /**
     * method to set a tweet message as a string
     * @param message
     * @throws TweetTooLongException
     */

    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() > 140){
            throw new TweetTooLongException();
        }
        this.message = message;
    }

    public abstract Boolean isImportant();

    @Override
    public String toString(){
        return date.toString() + " | " + message;
    }

}