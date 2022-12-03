package com.macbook.hang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {
public void myStatus(View view){
    view.getId();
    startActivity(new Intent(this,myStatus.class));
}

public void uploadStatus(View view){
    view.getId();
    startActivity(new Intent(this,uploadStatus.class));
}
    public void searchButton(View view){
        view.getId();
        startActivity(new Intent(this,friendsStatus.class));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
}