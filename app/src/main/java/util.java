package com.example.android.myapplication;

import com.google.firebase.database.FirebaseDatabase;

public class util {
    private static FirebaseDatabase mData;

    public static FirebaseDatabase getmData(){
        if(mData == null){
            mData =FirebaseDatabase.getInstance();
            mData.setPersistenceEnabled(true);
        }
        return mData;
    }
}
