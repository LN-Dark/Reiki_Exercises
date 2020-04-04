package com.lua.reikiexercises.ui.cincodiasatencaoplena;

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
import com.lua.reikiexercises.ui.setediascaminho.SeteDiasCaminhoDia1Activity;
import com.lua.reikiexercises.ui.setediascaminho.SeteDiasCaminhoDia2Activity;
import com.lua.reikiexercises.ui.setediascaminho.SeteDiasCaminhoDia3Activity;
import com.lua.reikiexercises.ui.setediascaminho.SeteDiasCaminhoDia4Activity;
import com.lua.reikiexercises.ui.setediascaminho.SeteDiasCaminhoDia5Activity;
import com.lua.reikiexercises.ui.setediascaminho.SeteDiasCaminhoDia6Activity;
import com.lua.reikiexercises.ui.setediascaminho.SeteDiasCaminhoDia7Activity;

import static android.content.Context.MODE_PRIVATE;

public class CincoDiasAtencaoPlenaFragment extends Fragment {
    private View root;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

         root = inflater.inflate(R.layout.fragment_cincodiasatencaoplena, container, false);
        MaterialCardView card_dia1 = root.findViewById(R.id.card_dia1_atencao);
        MaterialCardView card_dia2 = root.findViewById(R.id.card_dia2_atencao);
        MaterialCardView card_dia3 = root.findViewById(R.id.card_dia3_atencao);
        MaterialCardView card_dia4 = root.findViewById(R.id.card_dia4_atencao);
        MaterialCardView card_dia5 = root.findViewById(R.id.card_dia5_atencao);
        ImageView img_dia1_done = root.findViewById(R.id.img_atencao_dia1_done);
        ImageView img_dia2_done = root.findViewById(R.id.img_atencao_dia2_done);
        ImageView img_dia3_done = root.findViewById(R.id.img_atencao_dia3_done);
        ImageView img_dia4_done = root.findViewById(R.id.img_atencao_dia4_done);
        ImageView img_dia5_done = root.findViewById(R.id.img_atencao_dia5_done);
        SharedPreferences prefs = root.getContext().getSharedPreferences("ReikiExercises", MODE_PRIVATE);
        if(!prefs.getString("ReikiExercises_atencaoplena_Dia1_observacao", "").equals("")){
            img_dia1_done.setVisibility(View.VISIBLE);
        }
        if(!prefs.getString("ReikiExercises_atencaoplena_Dia2_observacao", "").equals("")){
            img_dia2_done.setVisibility(View.VISIBLE);
        }
        if(!prefs.getString("ReikiExercises_atencaoplena_Dia3_observacao", "").equals("")){
            img_dia3_done.setVisibility(View.VISIBLE);
        }
        if(!prefs.getString("ReikiExercises_atencaoplena_Dia4_observacao", "").equals("")){
            img_dia4_done.setVisibility(View.VISIBLE);
        }
        if(!prefs.getString("ReikiExercises_atencaoplena_Dia5_observacao", "").equals("")){
            img_dia5_done.setVisibility(View.VISIBLE);
        }
        card_dia1.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), AtencaoPlenaDia1Activity.class);
            startActivity(intent);
        });
        card_dia2.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), AtencaoPlenaDia2Activity.class);
            startActivity(intent);
        });
        card_dia3.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), AtencaoPlenaDia3Activity.class);
            startActivity(intent);
        });
        card_dia4.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), AtencaoPlenaDia4Activity.class);
            startActivity(intent);
        });
        card_dia5.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), AtencaoPlenaDia5Activity.class);
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
        searchItem.setVisible(false);

    }
}
