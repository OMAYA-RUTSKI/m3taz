package com.example.camm;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

class HomeActivity extends AppCompatActivity {

    private EditText etFirstName, etLastName, etPhoneNumber, etAddress;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        etFirstName = findViewById(R.id.etFirstName);
        etLastName = findViewById(R.id.etLastName);
        etPhoneNumber = findViewById(R.id.etPhoneNumber);
        etAddress = findViewById(R.id.etAddress);
        Button btnConfirmDetails = findViewById(R.id.btnConfirmDetails);

        btnConfirmDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
                intent.putExtra("firstName", etFirstName.getText().toString());
                intent.putExtra("lastName", etLastName.getText().toString());
                intent.putExtra("phoneNumber", etPhoneNumber.getText().toString());
                intent.putExtra("address", etAddress.getText().toString());
                startActivity(intent);
            }
        });
    }
}