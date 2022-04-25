package com.mertkadir.thickwallet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.mertkadir.thickwallet.view.WalletActivity;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);
    }
    public void backMain (View view) {
        Intent intent = new Intent(ProfileActivity.this, WalletActivity.class);
        startActivity(intent);
        finish();
    }
}