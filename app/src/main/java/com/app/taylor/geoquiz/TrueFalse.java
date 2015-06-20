package com.app.taylor.geoquiz;

/**
 * Created by taylor on 2015-06-20.
 */
public class TrueFalse {
    private int mQuestion;
    private boolean mTrueQuestion;

    public TrueFalse(int question, boolean trueQuestion) {
        mQuestion = question;
        mTrueQuestion = trueQuestion;
    }

    public int getQuestion() {
        return mQuestion;
    }

    public void setQuestion(int question) {
        this.mQuestion = question;
    }

    public void setTrueQuestion(boolean trueQuestion) {
        this.mTrueQuestion = trueQuestion;
    }

    public boolean isTrueQuestion() {
        return mTrueQuestion;
    }
}
