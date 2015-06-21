package com.app.taylor.geoquiz;

/**
 * Created by taylor on 2015-06-20.
 */
public class TrueFalse {
    private int mQuestion;
    private boolean mTrueQuestion;
    private boolean mHasCheated;

        public TrueFalse(int question, boolean trueQuestion, boolean hasCheated) {
        mQuestion = question;
        mTrueQuestion = trueQuestion;
        mHasCheated = hasCheated;

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

    public boolean isHasCheated() {
        return mHasCheated;
    }

    public void setHasCheated(boolean HasCheated) {
        this.mHasCheated = HasCheated;
    }

}
