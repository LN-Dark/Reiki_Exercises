package com.lua.reikiexercises.ui.setediascaminho;

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
import com.lua.reikiexercises.ui.iniciacao.InfoIniciacaoActivity;

import static android.content.Context.MODE_PRIVATE;

public class SeteDiasCaminhoFragment extends Fragment {
    private View root;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        root = inflater.inflate(R.layout.fragment_setediascaminho, container, false);
        MaterialCardView card_dia1 = root.findViewById(R.id.card_dia1_setedias);
        MaterialCardView card_dia2 = root.findViewById(R.id.card_dia2_setedias);
        MaterialCardView card_dia3 = root.findViewById(R.id.card_dia3_setedias);
        MaterialCardView card_dia4 = root.findViewById(R.id.card_dia4_setedias);
        MaterialCardView card_dia5 = root.findViewById(R.id.card_dia5_setedias);
        MaterialCardView card_dia6 = root.findViewById(R.id.card_dia6_setedias);
        MaterialCardView card_dia7 = root.findViewById(R.id.card_dia7_setedias);
        ImageView img_dia1_done = root.findViewById(R.id.img_setedias_dia1_done);
        ImageView img_dia2_done = root.findViewById(R.id.img_setedias_dia2_done);
        ImageView img_dia3_done = root.findViewById(R.id.img_setedias_dia3_done);
        ImageView img_dia4_done = root.findViewById(R.id.img_setedias_dia4_done);
        ImageView img_dia5_done = root.findViewById(R.id.img_setedias_dia5_done);
        ImageView img_dia6_done = root.findViewById(R.id.img_setedias_dia6_done);
        ImageView img_dia7_done = root.findViewById(R.id.img_setedias_dia7_done);
        SharedPreferences prefs = root.getContext().getSharedPreferences("ReikiExercises", MODE_PRIVATE);
        if(!prefs.getString("ReikiExercises_setedias_Dia1_observacao", "").equals("")){
            img_dia1_done.setVisibility(View.VISIBLE);
        }
        if(!prefs.getString("ReikiExercises_setedias_Dia2_observacao", "").equals("")){
            img_dia2_done.setVisibility(View.VISIBLE);
        }
        if(!prefs.getString("ReikiExercises_setedias_Dia3_observacao", "").equals("")){
            img_dia3_done.setVisibility(View.VISIBLE);
        }
        if(!prefs.getString("ReikiExercises_setedias_Dia4_observacao", "").equals("")){
            img_dia4_done.setVisibility(View.VISIBLE);
        }
        if(!prefs.getString("ReikiExercises_setedias_Dia5_observacao", "").equals("")){
            img_dia5_done.setVisibility(View.VISIBLE);
        }
        if(!prefs.getString("ReikiExercises_setedias_Dia6_observacao", "").equals("")){
            img_dia6_done.setVisibility(View.VISIBLE);
        }
        if(!prefs.getString("ReikiExercises_setedias_Dia7_observacao", "").equals("")){
            img_dia7_done.setVisibility(View.VISIBLE);
        }
        card_dia1.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), SeteDiasCaminhoDia1Activity.class);
            startActivity(intent);
        });
        card_dia2.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), SeteDiasCaminhoDia2Activity.class);
            startActivity(intent);
        });
        card_dia3.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), SeteDiasCaminhoDia3Activity.class);
            startActivity(intent);
        });
        card_dia4.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), SeteDiasCaminhoDia4Activity.class);
            startActivity(intent);
        });
        card_dia5.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), SeteDiasCaminhoDia5Activity.class);
            startActivity(intent);
        });
        card_dia6.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), SeteDiasCaminhoDia6Activity.class);
            startActivity(intent);
        });
        card_dia7.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), SeteDiasCaminhoDia7Activity.class);
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
