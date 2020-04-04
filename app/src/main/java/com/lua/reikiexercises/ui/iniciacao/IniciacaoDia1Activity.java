package com.lua.reikiexercises.ui.iniciacao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.lua.reikiexercises.R;

public class IniciacaoDia1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciacao_dia1);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(getDrawable(R.mipmap.ic_launcher));
        getSupportActionBar().setTitle(getString(R.string.cincodias_iniciacao));
        getSupportActionBar().setSubtitle(getString(R.string.dia_1_s_por_hoje_sou_calmo));
        TextInputEditText txt_perguntas1 = findViewById(R.id.edittext_iniciacao_dia1_resposta_pergunta1_input);
        TextInputEditText txt_perguntas2 = findViewById(R.id.edittext_iniciacao_dia1_resposta_pergunta2_input);
        MaterialButton btn_save = findViewById(R.id.btn_fechar_iniciacao_dia1);
        SharedPreferences prefs = getSharedPreferences("ReikiExercises", MODE_PRIVATE);
        String pergunta1 = prefs.getString("ReikiExercises_iniciacao_Dia1_pergunta1", "");
        String pergunta2 = prefs.getString("ReikiExercises_iniciacao_Dia1_pergunta2", "");
        if(!pergunta1.equals("")){
            txt_perguntas1.setText(pergunta1);
        }
        if(!pergunta2.equals("")){
            txt_perguntas2.setText(pergunta2);
        }
        btn_save.setOnClickListener(v -> {
            SharedPreferences.Editor editor = getSharedPreferences("ReikiExercises", MODE_PRIVATE).edit();
            if(!txt_perguntas1.getText().toString().equals("")){
                editor.putString("ReikiExercises_iniciacao_Dia1_pergunta1", txt_perguntas1.getText().toString());
            }else{
                editor.putString("ReikiExercises_iniciacao_Dia1_pergunta1", "");
            }
            if(!txt_perguntas2.getText().toString().equals("")){
                editor.putString("ReikiExercises_iniciacao_Dia1_pergunta2", txt_perguntas2.getText().toString());
            }else{
                editor.putString("ReikiExercises_iniciacao_Dia1_pergunta2", "");
            }
            editor.apply();
            finish();
        });
    }
}