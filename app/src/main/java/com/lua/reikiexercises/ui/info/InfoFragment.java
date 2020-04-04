package com.lua.reikiexercises.ui.info;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.lua.reikiexercises.R;
import com.lua.reikiexercises.ui.elevacaoconsiencia5dias.ConscienciaDia4Activity;
import com.lua.reikiexercises.ui.iniciacao.InfoIniciacaoActivity;

public class InfoFragment extends Fragment {
    View root;

    public InfoFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        root = inflater.inflate(R.layout.fragment_info, container, false);
        ImageView btn_telegram = root.findViewById(R.id.btn_telegram);
        ImageView btn_paypal = root.findViewById(R.id.btn_paypal);
        ImageView btn_github = root.findViewById(R.id.btn_github);
        ImageView btn_apr = root.findViewById(R.id.img_info_apr);
        MaterialButton btn_gassho = root.findViewById(R.id.btn_GASSHO_info);
        MaterialButton btn_reiji_ho = root.findViewById(R.id.btn_Reiji_Ho_info);
        MaterialButton btn_chiryo = root.findViewById(R.id.btn_CHIRYO_info);
        MaterialButton btn_Kenyoku_ho = root.findViewById(R.id.btn_Kenyoku_ho_info);
        btn_Kenyoku_ho.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), InfoKENYOKU_HOActivity.class);
            startActivity(intent);
        });
        btn_gassho.setOnClickListener(v -> {
            MaterialAlertDialogBuilder builder = new MaterialAlertDialogBuilder(root.getContext());
            LinearLayout layout = new LinearLayout(root.getContext());
            layout.setOrientation(LinearLayout.VERTICAL);
            builder.setIcon(root.getContext().getDrawable(R.mipmap.ic_launcher));
            builder.setTitle(getString(R.string.gassho));
            layout.setGravity(Gravity.CENTER);
            final TextView espaco4 = new TextView(root.getContext());
            espaco4.setText(getResources().getString(R.string.tecnicagasshoexplicacao));
            espaco4.setTextSize(19);
            espaco4.setGravity(Gravity.CENTER);
            layout.addView(espaco4);
            final TextView espaco2 = new TextView(root.getContext());
            espaco2.setText("\n");
            espaco2.setTextSize(25);
            espaco2.setGravity(Gravity.CENTER);
            layout.addView(espaco2);
            final ImageView img_exemplo = new ImageView(root.getContext());
            img_exemplo.setMaxWidth(300);
            img_exemplo.setMaxHeight(300);
            img_exemplo.setImageDrawable(root.getResources().getDrawable(R.drawable.gassho, null));
            layout.addView(img_exemplo);
            builder.setView(layout);
            builder.setPositiveButton(getString(R.string.ok), (dialog, which) -> {
            });
            builder.show();
        });
        btn_chiryo.setOnClickListener(v -> {
            MaterialAlertDialogBuilder builder = new MaterialAlertDialogBuilder(root.getContext());
            LinearLayout layout = new LinearLayout(root.getContext());
            layout.setOrientation(LinearLayout.VERTICAL);
            builder.setIcon(root.getContext().getDrawable(R.mipmap.ic_launcher));
            builder.setTitle(getString(R.string.gassho));
            layout.setGravity(Gravity.CENTER);
            final TextView espaco4 = new TextView(root.getContext());
            espaco4.setText(getResources().getString(R.string.chiryoexplicacao));
            espaco4.setTextSize(19);
            espaco4.setGravity(Gravity.CENTER);
            layout.addView(espaco4);
            final TextView espaco2 = new TextView(root.getContext());
            espaco2.setText("\n");
            espaco2.setTextSize(25);
            espaco2.setGravity(Gravity.CENTER);
            layout.addView(espaco2);
            final ImageView img_exemplo = new ImageView(root.getContext());
            img_exemplo.setMaxWidth(300);
            img_exemplo.setMaxHeight(300);
            img_exemplo.setImageDrawable(root.getResources().getDrawable(R.drawable.chiryo, null));
            layout.addView(img_exemplo);
            builder.setView(layout);
            builder.setPositiveButton(getString(R.string.ok), (dialog, which) -> {
            });
            builder.show();
        });
        btn_reiji_ho.setOnClickListener(v -> {
            MaterialAlertDialogBuilder builder = new MaterialAlertDialogBuilder(root.getContext());
            LinearLayout layout = new LinearLayout(root.getContext());
            layout.setOrientation(LinearLayout.VERTICAL);
            builder.setIcon(root.getContext().getDrawable(R.mipmap.ic_launcher));
            builder.setTitle(getString(R.string.gassho));
            layout.setGravity(Gravity.CENTER);
            final TextView espaco4 = new TextView(root.getContext());
            espaco4.setText(getString(R.string.reiji_ho_explicacao));
            espaco4.setTextSize(19);
            espaco4.setGravity(Gravity.CENTER);
            layout.addView(espaco4);
            final TextView espaco2 = new TextView(root.getContext());
            espaco2.setText("\n");
            espaco2.setTextSize(25);
            espaco2.setGravity(Gravity.CENTER);
            layout.addView(espaco2);
            final ImageView img_exemplo = new ImageView(root.getContext());
            img_exemplo.setMaxWidth(300);
            img_exemplo.setMaxHeight(300);
            img_exemplo.setImageDrawable(root.getResources().getDrawable(R.drawable.reiji_ho, null));
            layout.addView(img_exemplo);
            builder.setView(layout);
            builder.setPositiveButton(getString(R.string.ok), (dialog, which) -> {
            });
            builder.show();
        });
        btn_github.setOnClickListener(v -> {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/LN-Dark"));
            startActivity(browserIntent);
        });
        btn_apr.setOnClickListener(v -> {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.associacaoportuguesadereiki.com/"));
            startActivity(browserIntent);
        });
        btn_telegram.setOnClickListener(v -> {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/LN_DarK"));
            startActivity(browserIntent);
        });
        btn_paypal.setOnClickListener(v -> {
            MaterialAlertDialogBuilder builder = new MaterialAlertDialogBuilder(root.getContext());
            LinearLayout layout = new LinearLayout(root.getContext());
            layout.setOrientation(LinearLayout.VERTICAL);
            builder.setIcon(root.getContext().getDrawable(R.mipmap.ic_launcher));
            builder.setTitle(getString(R.string.doar));
            layout.setGravity(Gravity.CENTER);
            final TextView espaco4 = new TextView(root.getContext());
            espaco4.setText(getString(R.string.obrigadopeladoacao));
            espaco4.setTextSize(19);
            espaco4.setGravity(Gravity.CENTER);
            layout.addView(espaco4);
            final TextView espaco2 = new TextView(root.getContext());
            espaco2.setText("\n");
            espaco2.setTextSize(25);
            espaco2.setGravity(Gravity.CENTER);
            layout.addView(espaco2);
            builder.setView(layout);
            builder.setPositiveButton(getString(R.string.ok), (dialog, which) -> {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://paypal.me/pedrocruz77"));
                startActivity(browserIntent);
            });
            builder.setNeutralButton(getString(R.string.cancel), (dialog, which) -> dialog.dismiss());
            builder.show();
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
