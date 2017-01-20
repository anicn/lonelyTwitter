package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by anicn on 2017-01-19.
 */

public class SadMood extends Mood {
    public SadMood(Date date, String mood) {
        super(date, mood);
    }

    public SadMood(String mood) {
        super(mood);
    }

    @Override
    public String mood(){
        return ":(";
    }
}
