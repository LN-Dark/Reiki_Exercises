package com.lua.reikiexercises.ui.iniciacao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.lua.reikiexercises.R;

public class IniciacaoDia5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciacao_dia5);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(getDrawable(R.mipmap.ic_launcher));
        getSupportActionBar().setTitle(getString(R.string.cincodias_iniciacao));
        getSupportActionBar().setSubtitle(getString(R.string.dia_5_s_por_hoje_sou_bondoso));
        TextInputEditText txt_perguntas1 = findViewById(R.id.edittext_iniciacao_dia5_resposta_pergunta1_input);
        TextInputEditText txt_perguntas2 = findViewById(R.id.edittext_iniciacao_dia5_resposta_pergunta2_input);
        MaterialButton btn_save = findViewById(R.id.btn_fechar_iniciacao_dia5);
        SharedPreferences prefs = getSharedPreferences("ReikiExercises", MODE_PRIVATE);
        String pergunta1 = prefs.getString("ReikiExercises_iniciacao_Dia5_pergunta1", "");
        String pergunta2 = prefs.getString("ReikiExercises_iniciacao_Dia5_pergunta2", "");
        if(!pergunta1.equals("")){
            txt_perguntas1.setText(pergunta1);
        }
        if(!pergunta2.equals("")){
            txt_perguntas2.setText(pergunta2);
        }
        btn_save.setOnClickListener(v -> {
            SharedPreferences.Editor editor = getSharedPreferences("ReikiExercises", MODE_PRIVATE).edit();
            if(!txt_perguntas1.getText().toString().equals("")){
                editor.putString("ReikiExercises_iniciacao_Dia5_pergunta1", txt_perguntas1.getText().toString());
            }else{
                editor.putString("ReikiExercises_iniciacao_Dia5_pergunta1", "");
            }
            if(!txt_perguntas2.getText().toString().equals("")){
                editor.putString("ReikiExercises_iniciacao_Dia5_pergunta2", txt_perguntas2.getText().toString());
            }else{
                editor.putString("ReikiExercises_iniciacao_Dia5_pergunta2", "");
            }
            editor.apply();
            SharedPreferences prefs1 = getSharedPreferences("ReikiExercises", MODE_PRIVATE);
            String firstobrigado = prefs1.getString("ReikiExercises_iniciacao_Obrigado", "");
            if(!firstobrigado.equals("1")){
                Intent intent = new Intent(this, IniciacaoDia5ObrigadoActivity.class);
                startActivity(intent);
            }
            finish();
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.optionsmenu, menu);
        MenuItem searchItem = menu.findItem(R.id.info);
        searchItem.setOnMenuItemClickListener(item -> {
            Intent intent = new Intent(this, IniciacaoDia5ObrigadoActivity.class);
            startActivity(intent);
            return true;
        });
        return true;
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
