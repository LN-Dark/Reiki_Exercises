package com.lua.reikiexercises.ui.info;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;

import com.google.android.material.button.MaterialButton;
import com.lua.reikiexercises.R;

public class InfoKENYOKU_HOActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_k_e_n_y_o_k_u__h_o);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(getDrawable(R.mipmap.ic_launcher));
        getSupportActionBar().setTitle(getString(R.string.app_name));
        MaterialButton btn_fechar = findViewById(R.id.btn_fechar_infobanhoseco);
        btn_fechar.setOnClickListener(v -> {
            finish();
        });
    }
}
