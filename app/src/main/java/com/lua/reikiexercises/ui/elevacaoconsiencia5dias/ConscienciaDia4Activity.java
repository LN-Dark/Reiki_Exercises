package com.lua.reikiexercises.ui.elevacaoconsiencia5dias;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.lua.reikiexercises.R;

public class ConscienciaDia4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consciencia_dia4);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(getDrawable(R.mipmap.ic_launcher));
        getSupportActionBar().setTitle(getString(R.string.cincodias_elevacaoconsciencia));
        getSupportActionBar().setSubtitle(getString(R.string.dia_4_s_por_hoje_trabalho_honestamente));
        TextInputEditText txt_observacao = findViewById(R.id.edittext_consciencia_dia4_observacao_input);
        MaterialButton btn_save = findViewById(R.id.btn_fechar_consciencia_dia4);
        SharedPreferences prefs = getSharedPreferences("ReikiExercises", MODE_PRIVATE);
        String pergunta1 = prefs.getString("ReikiExercises_consciencia_Dia4_observacao", "");
        if(!pergunta1.equals("")){
            txt_observacao.setText(pergunta1);
        }
        btn_save.setOnClickListener(v -> {
            SharedPreferences.Editor editor = getSharedPreferences("ReikiExercises", MODE_PRIVATE).edit();
            if(!txt_observacao.getText().toString().equals("")){
                editor.putString("ReikiExercises_consciencia_Dia4_observacao", txt_observacao.getText().toString());
            }else{
                editor.putString("ReikiExercises_consciencia_Dia4_observacao", "");
            }
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
