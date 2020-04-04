package com.lua.reikiexercises.ui.iniciacao;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.material.card.MaterialCardView;
import com.lua.reikiexercises.R;

import static android.content.Context.MODE_PRIVATE;

public class IniciacaoFragment extends Fragment {
    private View root;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.fragment_iniciacao, container, false);
        MaterialCardView card_dia1 = root.findViewById(R.id.card_dia1_iniciacao);
        MaterialCardView card_dia2 = root.findViewById(R.id.card_dia2_iniciacao);
        MaterialCardView card_dia3 = root.findViewById(R.id.card_dia3_iniciacao);
        MaterialCardView card_dia4 = root.findViewById(R.id.card_dia4_iniciacao);
        MaterialCardView card_dia5 = root.findViewById(R.id.card_dia5_iniciacao);
        ImageView img_dia1_done = root.findViewById(R.id.img_iniciacao_dia1_done);
        ImageView img_dia2_done = root.findViewById(R.id.img_iniciacao_dia2_done);
        ImageView img_dia3_done = root.findViewById(R.id.img_iniciacao_dia3_done);
        ImageView img_dia4_done = root.findViewById(R.id.img_iniciacao_dia4_done);
        ImageView img_dia5_done = root.findViewById(R.id.img_iniciacao_dia5_done);
        SharedPreferences prefs = root.getContext().getSharedPreferences("ReikiExercises", MODE_PRIVATE);
        String firstIniciacao = prefs.getString("ReikiExercises_iniciacao_Info", "");
        if(!firstIniciacao.equals("1")){
            Intent intent = new Intent(getActivity(), InfoIniciacaoActivity.class);
            startActivity(intent);
        }
        if(!prefs.getString("ReikiExercises_iniciacao_Dia1_pergunta1", "").equals("") || !prefs.getString("ReikiExercises_iniciacao_Dia1_pergunta2", "").equals("")){
            img_dia1_done.setVisibility(View.VISIBLE);
        }
        if(!prefs.getString("ReikiExercises_iniciacao_Dia2_pergunta1", "").equals("") || !prefs.getString("ReikiExercises_iniciacao_Dia2_pergunta2", "").equals("")){
            img_dia2_done.setVisibility(View.VISIBLE);
        }
        if(!prefs.getString("ReikiExercises_iniciacao_Dia3_pergunta1", "").equals("") || !prefs.getString("ReikiExercises_iniciacao_Dia3_pergunta2", "").equals("")){
            img_dia3_done.setVisibility(View.VISIBLE);
        }
        if(!prefs.getString("ReikiExercises_iniciacao_Dia4_pergunta1", "").equals("") || !prefs.getString("ReikiExercises_iniciacao_Dia4_pergunta2", "").equals("")){
            img_dia4_done.setVisibility(View.VISIBLE);
        }
        if(!prefs.getString("ReikiExercises_iniciacao_Dia5_pergunta1", "").equals("") || !prefs.getString("ReikiExercises_iniciacao_Dia5_pergunta2", "").equals("")){
            img_dia5_done.setVisibility(View.VISIBLE);
        }
        card_dia1.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), IniciacaoDia1Activity.class);
            startActivity(intent);
        });
        card_dia2.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), IniciacaoDia2Activity.class);
            startActivity(intent);
        });
        card_dia3.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), IniciacaoDia3Activity.class);
            startActivity(intent);
        });
        card_dia4.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), IniciacaoDia4Activity.class);
            startActivity(intent);
        });
        card_dia5.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), IniciacaoDia5Activity.class);
            startActivity(intent);
        });
        return root;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        MenuItem searchItem = menu.findItem(R.id.info);
        searchItem.setOnMenuItemClickListener(item -> {
            Intent intent = new Intent(getActivity(), InfoIniciacaoActivity.class);
            startActivity(intent);
            return true;
        });

    }
}
