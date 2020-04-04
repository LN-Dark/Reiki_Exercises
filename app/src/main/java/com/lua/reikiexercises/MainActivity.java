package com.lua.reikiexercises;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.lua.reikiexercises.ui.cincodiasatencaoplena.CincoDiasAtencaoPlenaFragment;
import com.lua.reikiexercises.ui.elevacaoconsiencia5dias.ElevacaoConscienciaCincoDiasFragment;
import com.lua.reikiexercises.ui.info.InfoFragment;
import com.lua.reikiexercises.ui.iniciacao.IniciacaoFragment;
import com.lua.reikiexercises.ui.setediascaminho.SeteDiasCaminhoFragment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadFragment(new IniciacaoFragment());
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(getDrawable(R.mipmap.ic_launcher));
        BottomNavigationView navigation = findViewById(R.id.nav_view);
        navigation.setOnNavigationItemSelectedListener(this);
        navigation.setItemIconTintList(null);
        getSupportActionBar().setTitle(getString(R.string.cincodias_iniciacao));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.optionsmenu, menu);
        return true;
    }

    public boolean loadFragment(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .addToBackStack(null)
                    .setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left, R.anim.enter_from_left, R.anim.exit_to_right)
                    .replace(R.id.fragment_container, fragment)
                    .commit();
            return true;
        }
        return false;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment = null;
        switch (item.getItemId()) {
            case R.id.navigation_iniciacao:
                fragment = new IniciacaoFragment();
                getSupportActionBar().setTitle(getString(R.string.cincodias_iniciacao));
                break;
            case R.id.navigation_setediascaminho:
                fragment = new SeteDiasCaminhoFragment();
                getSupportActionBar().setTitle(getString(R.string.setedias_caminho));
                break;
            case R.id.navigation_cincodiasatencaoplena:
                fragment = new CincoDiasAtencaoPlenaFragment();
                getSupportActionBar().setTitle(getString(R.string.cincodias_atencaoplena));
                break;
            case R.id.navigation_cincodiaselevacaoconsciencia:
                fragment = new ElevacaoConscienciaCincoDiasFragment();
                getSupportActionBar().setTitle(getString(R.string.cincodias_elevacaoconsciencia));
                break;
            case R.id.navigation_info:
                fragment = new InfoFragment();
                getSupportActionBar().setTitle(getString(R.string.informa_ao));
                break;
        }
        return loadFragment(fragment);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        if(getSupportFragmentManager().getFragments().isEmpty()){
            this.finish();
        }
    }

}
