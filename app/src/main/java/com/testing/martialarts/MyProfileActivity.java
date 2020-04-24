package com.testing.martialarts;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import de.hdodenhof.circleimageview.CircleImageView;

public class MyProfileActivity extends AppCompatActivity {
    CircleImageView img_profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myprofile);

        if(getSupportActionBar() != null){
            getSupportActionBar().setTitle("About Me");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        img_profile = findViewById(R.id.img_profile);
    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
