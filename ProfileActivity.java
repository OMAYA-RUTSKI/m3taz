package com.example.camm;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

class ProfileActivity extends AppCompatActivity {

    private ImageView ivProfilePicture;
    private TextView tvDetails;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivProfilePicture = findViewById(R.id.ivProfilePicture);
        tvDetails = findViewById(R.id.tvDetails);

        String firstName = getIntent().getStringExtra("firstName");
        String lastName = getIntent().getStringExtra("lastName");
        String phoneNumber = getIntent().getStringExtra("phoneNumber");
        String address = getIntent().getStringExtra("address");

        tvDetails.setText(firstName + " " + lastName + "\n" + phoneNumber + "\n" + address);

        Button btnGoBack = findViewById(R.id.btnGoBack);
        Button btnChangePicture = findViewById(R.id.btnGoBack);

        btnGoBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnChangePicture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}