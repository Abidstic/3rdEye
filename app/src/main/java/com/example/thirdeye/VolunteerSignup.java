package com.example.thirdeye;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VolunteerSignup extends AppCompatActivity {
    private Button go_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        go_back=findViewById(R.id.go_back_vol);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volunteer_signup);
//        go_back.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                onBackPressed();
//            }
//        });
    }
}