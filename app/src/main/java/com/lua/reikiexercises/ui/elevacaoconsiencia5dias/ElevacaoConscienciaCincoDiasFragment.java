package com.lua.reikiexercises.ui.elevacaoconsiencia5dias;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.google.android.material.card.MaterialCardView;
import com.lua.reikiexercises.R;

import static android.content.Context.MODE_PRIVATE;

public class ElevacaoConscienciaCincoDiasFragment extends Fragment {
    private View root;

    public ElevacaoConscienciaCincoDiasFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        root = inflater.inflate(R.layout.fragment_elevacao_consciencia_cinco_dias, container, false);
        MaterialCardView card_dia1 = root.findViewById(R.id.card_dia1_consciencia);
        MaterialCardView card_dia2 = root.findViewById(R.id.card_dia2_consciencia);
        MaterialCardView card_dia3 = root.findViewById(R.id.card_dia3_consciencia);
        MaterialCardView card_dia4 = root.findViewById(R.id.card_dia4_consciencia);
        MaterialCardView card_dia5 = root.findViewById(R.id.card_dia5_consciencia);
        ImageView img_dia1_done = root.findViewById(R.id.img_consciencia_dia1_done);
        ImageView img_dia2_done = root.findViewById(R.id.img_consciencia_dia2_done);
        ImageView img_dia3_done = root.findViewById(R.id.img_consciencia_dia3_done);
        ImageView img_dia4_done = root.findViewById(R.id.img_consciencia_dia4_done);
        ImageView img_dia5_done = root.findViewById(R.id.img_consciencia_dia5_done);
        SharedPreferences prefs = root.getContext().getSharedPreferences("ReikiExercises", MODE_PRIVATE);
        if(!prefs.getString("ReikiExercises_consciencia_Dia1_observacao", "").equals("")){
            img_dia1_done.setVisibility(View.VISIBLE);
        }
        if(!prefs.getString("ReikiExercises_consciencia_Dia2_observacao", "").equals("")){
            img_dia2_done.setVisibility(View.VISIBLE);
        }
        if(!prefs.getString("ReikiExercises_consciencia_Dia3_observacao", "").equals("")){
            img_dia3_done.setVisibility(View.VISIBLE);
        }
        if(!prefs.getString("ReikiExercises_consciencia_Dia4_observacao", "").equals("")){
            img_dia4_done.setVisibility(View.VISIBLE);
        }
        if(!prefs.getString("ReikiExercises_consciencia_Dia5_observacao", "").equals("")){
            img_dia5_done.setVisibility(View.VISIBLE);
        }
        card_dia1.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), ConscienciaDia1Activity.class);
            startActivity(intent);
        });
        card_dia2.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), ConscienciaDia2Activity.class);
            startActivity(intent);
        });
        card_dia3.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), ConscienciaDia3Activity.class);
            startActivity(intent);
        });
        card_dia4.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), ConscienciaDia4Activity.class);
            startActivity(intent);
        });
        card_dia5.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), ConscienciaDia5Activity.class);
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
            Intent intent = new Intent(getActivity(), ConscienciaInfoActivity.class);
            startActivity(intent);
            return true;
        });
    }
}
