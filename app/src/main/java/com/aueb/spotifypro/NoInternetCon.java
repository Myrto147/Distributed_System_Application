package com.aueb.spotifypro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.spotifypro.R;

public class NoInternetCon extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_internet_con);
    }

    public void onBackPressed(){
        Intent artistlistintent=new Intent(NoInternetCon.this,MainActivity.class);
        startActivity(artistlistintent);
    }
}
