package com.example.tema1;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity implements OnActivityFragmentCommunication{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
    }

    @Override
    public void killYourself() {

    }

    @Override
    public void onReplaceFragment(String TAG) {

    }

    @Override
    public void onPopFragment() {

    }
}
