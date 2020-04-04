package com.lua.reikiexercises.ui.iniciacao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;
import com.lua.reikiexercises.R;

public class InfoIniciacaoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_iniciacao);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(getDrawable(R.mipmap.ic_launcher));
        getSupportActionBar().setTitle(getString(R.string.app_name));
        TextView tittle = findViewById(R.id.txt_info_iniciacao_tittle);
        TextView info = findViewById(R.id.txt_info_iniciacao);
        MaterialButton btn_fechar = findViewById(R.id.btn_fechar_infoiniciacao);
        info.setMovementMethod(new ScrollingMovementMethod());
        tittle.setText(getString(R.string.cincodiasparacomecarreikititulo));
        info.setText(getString(R.string.infocincodiasiniciacao));
        btn_fechar.setOnClickListener(v -> {
            SharedPreferences.Editor editor = getSharedPreferences("ReikiExercises", MODE_PRIVATE).edit();
            editor.putString("ReikiExercises_iniciacao_Info", "1");
            editor.apply();
            finish();
        });
    }
}
