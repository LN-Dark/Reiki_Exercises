package com.lua.reikiexercises.ui.setediascaminho;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.lua.reikiexercises.R;

public class SeteDiasCaminhoDia4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sete_dias_caminho_dia4);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(getDrawable(R.mipmap.ic_launcher));
        getSupportActionBar().setTitle(getString(R.string.setedias_caminho));
        getSupportActionBar().setSubtitle(getString(R.string.dia_4_anahata));
        TextInputEditText txt_observacao = findViewById(R.id.edittext_setedias_dia4_observacao_input);
        MaterialButton btn_save = findViewById(R.id.btn_fechar_setedias_dia4);
        SharedPreferences prefs = getSharedPreferences("ReikiExercises", MODE_PRIVATE);
        String pergunta1 = prefs.getString("ReikiExercises_setedias_Dia4_observacao", "");
        if(!pergunta1.equals("")){
            txt_observacao.setText(pergunta1);
        }
        btn_save.setOnClickListener(v -> {
            SharedPreferences.Editor editor = getSharedPreferences("ReikiExercises", MODE_PRIVATE).edit();
            if(!txt_observacao.getText().toString().equals("")){
                editor.putString("ReikiExercises_setedias_Dia4_observacao", txt_observacao.getText().toString());
            }else{
                editor.putString("ReikiExercises_setedias_Dia4_observacao", "");
            }
            editor.apply();
            finish();
        });
    }
}
