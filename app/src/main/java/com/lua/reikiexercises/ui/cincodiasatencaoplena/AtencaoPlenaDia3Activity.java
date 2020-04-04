package com.lua.reikiexercises.ui.cincodiasatencaoplena;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.lua.reikiexercises.R;

public class AtencaoPlenaDia3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atencao_plena_dia3);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(getDrawable(R.mipmap.ic_launcher));
        getSupportActionBar().setTitle(getString(R.string.cincodias_atencaoplena));
        getSupportActionBar().setSubtitle(getString(R.string.dia_3_desintoxicar_libertar));
        TextInputEditText txt_observacao = findViewById(R.id.edittext_atencaoplena_dia3_observacao_input);
        MaterialButton btn_save = findViewById(R.id.btn_fechar_atencaoplena_dia3);
        SharedPreferences prefs = getSharedPreferences("ReikiExercises", MODE_PRIVATE);
        String pergunta1 = prefs.getString("ReikiExercises_atencaoplena_Dia3_observacao", "");
        if(!pergunta1.equals("")){
            txt_observacao.setText(pergunta1);
        }
        btn_save.setOnClickListener(v -> {
            SharedPreferences.Editor editor = getSharedPreferences("ReikiExercises", MODE_PRIVATE).edit();
            if(!txt_observacao.getText().toString().equals("")){
                editor.putString("ReikiExercises_atencaoplena_Dia3_observacao", txt_observacao.getText().toString());
            }else{
                editor.putString("ReikiExercises_atencaoplena_Dia3_observacao", "");
            }
            editor.apply();
            finish();
        });
    }
}
