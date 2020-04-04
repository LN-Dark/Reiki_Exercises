package com.lua.reikiexercises.ui.iniciacao;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;
import com.lua.reikiexercises.R;

public class IniciacaoDia5ObrigadoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciacao_dia5_obrigado);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(getDrawable(R.mipmap.ic_launcher));
        getSupportActionBar().setTitle(R.string.app_name);
        TextView tittle = findViewById(R.id.txt_iniciacao_dia5_obrigado_tittle);
        TextView info = findViewById(R.id.txt_iniciacao_dia5_obrigado);
        MaterialButton btn_fechar = findViewById(R.id.btn_fechar_iniciacao_dia5_obrigado);
        info.setMovementMethod(new ScrollingMovementMethod());
        tittle.setText(getString(R.string.muitoobrigadoporcuidaresdeti));
        info.setText(getString(R.string.muitoobrigadopelos5dias));
        btn_fechar.setOnClickListener(v -> {
            SharedPreferences.Editor editor = getSharedPreferences("ReikiExercises", MODE_PRIVATE).edit();
            editor.putString("ReikiExercises_iniciacao_Obrigado", "1");
            editor.apply();
            finish();
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
