package com.example.aaron.myapplication;

import java.util.UUID;

/**
 * Created by aaron on 2/12/2016.
 */


public class Question {
    private String mQuestionTitle;
    private String mAnswer;
    private UUID mId;



    public Question(String questionTitle, String answer) {
        this.mQuestionTitle = questionTitle;
        this.mAnswer = answer;
        this.mId = UUID.randomUUID();

    }


    public String getAnswer() {
        return mAnswer;
    }

    public void setAnswer(String mAnswer) {
        this.mAnswer = mAnswer;
    }

    public UUID getmId() {
        return mId;
    }

    public void setmId(UUID mId) {
        this.mId = mId;
    }

    public UUID getId() {
        return mId;
    }
    public String getQuestionTitle() {
        return mQuestionTitle;
    }

    public void setQuestionTitle(String mQuestionTitle) {
        this.mQuestionTitle = mQuestionTitle;
    }

}
