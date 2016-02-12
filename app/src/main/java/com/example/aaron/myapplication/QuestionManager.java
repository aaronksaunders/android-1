package com.example.aaron.myapplication;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


public class QuestionManager {
    private static QuestionManager sQuestionManager;

    private List<Question> mQuestions;


    public static QuestionManager get(Context context) {
        if (sQuestionManager == null) {
            sQuestionManager = new QuestionManager(context);
        }
        return sQuestionManager;
    }

    private QuestionManager(Context context) {
        mQuestions = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            mQuestions.add(new Question("Question Number " + i, "Answer For Number " + i));
        }
    }

    public List<Question> getQuestions() {
        return mQuestions;
    }

    public Question getQuestion(UUID id) {
        for (Question question : mQuestions  ) {
            if (question.getId().equals(id)) {
                return question;
            }
        }
        return null;
    }
}
