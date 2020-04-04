package com.lua.reikiexercises.ui.elevacaoconsiencia5dias;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;
import com.lua.reikiexercises.R;

public class ConscienciaInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consciencia_info);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(getDrawable(R.mipmap.ic_launcher));
        getSupportActionBar().setTitle(getString(R.string.app_name));
        TextView info = findViewById(R.id.txt_info_consciencia);
        MaterialButton btn_fechar = findViewById(R.id.btn_fechar_infoconsciencia);
        info.setMovementMethod(new ScrollingMovementMethod());
        btn_fechar.setOnClickListener(v -> {
            SharedPreferences.Editor editor = getSharedPreferences("ReikiExercises", MODE_PRIVATE).edit();
            editor.putString("ReikiExercises_consciencia_Info", "1");
            editor.apply();
            finish();
        });
    }
}
