package com.mertkadir.thickwallet.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;
import com.mertkadir.thickwallet.databinding.ActivityWalletBinding;

public class WalletActivity extends AppCompatActivity {

    private ActivityWalletBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityWalletBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);





    }



    public void configButton (View view) {
        Intent intent = new Intent(WalletActivity.this, SettingsActivity.class);
        startActivity(intent);
        finish();

    }
    public void mainMenuButton (View view) {

        Intent intent = new Intent(WalletActivity.this,WalletActivity.class);
        startActivity(intent);
        finish();

    }







}