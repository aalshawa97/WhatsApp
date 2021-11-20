package com.example.whatsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.FirebaseApp;

public class MainActivity extends AppCompatActivity {

    //private lateinit var analytics: FirebaseAnalytics
    private EditText mPhoneNumber, mCode;
    private Button mSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCode = findViewById(R.id.code);
        FirebaseApp.initializeApp(this);
    }
}