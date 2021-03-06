package com.app.taylor.geoquiz;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by taylor on 2015-06-20.
 */
public class TrueFalse implements Parcelable{
    private int mQuestion;
    private boolean mTrueQuestion;
    private boolean mHasCheated;

    // Parcelable boilerplate
    protected TrueFalse(Parcel in) {
        mQuestion = in.readInt();
        boolean[] boolArray =  new boolean[2];
        in.readBooleanArray(boolArray);
        mTrueQuestion = boolArray[0];
        mHasCheated = boolArray[1];
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(mQuestion);
        dest.writeBooleanArray(new boolean[]{mTrueQuestion, mHasCheated});
    }

    public static final Parcelable.Creator<TrueFalse> CREATOR = new Parcelable.Creator<TrueFalse>() {
        public TrueFalse createFromParcel(Parcel in) {
            return new TrueFalse(in);
        }

        public TrueFalse[] newArray(int size) {
            return new TrueFalse[size];
        }
    };

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
