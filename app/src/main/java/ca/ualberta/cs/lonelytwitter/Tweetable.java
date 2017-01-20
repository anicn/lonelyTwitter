package ca.ualberta.cs.lonelytwitter;

/**
 * Created by anicn on 2017-01-19.
 */

public interface Tweetable {
    public String getMessage();
    public void setMessage(String string) throws TweetTooLongException;
}
