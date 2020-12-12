package com.developndesign.firebaseautomlvisionedge;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import android.widget.Toolbar;

import com.google.android.material.navigation.NavigationView;

public class FirstActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    androidx.appcompat.widget.Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        drawerLayout=findViewById(R.id.drawer_layout);
        navigationView=findViewById(R.id.nav_view);
        toolbar=findViewById(R.id.toolbar);

        LayoutInflater inflater = (LayoutInflater)this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view = inflater.inflate(R.layout.navheader, null);

        setSupportActionBar(toolbar);

        navigationView.setNavigationItemSelectedListener(FirstActivity.this);

        navigationView.setCheckedItem(R.id.nav_home);

        navigationView.setItemIconTintList(null);

        getSupportActionBar().setDisplayShowTitleEnabled(true);

        navigationView.bringToFront();

//        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.app_name,R.string.app_name);
//        drawerLayout.addDrawerListener(toggle);
//        toggle.syncState();





    }

    public void OnClickFlower(View view) {
        startActivity(new Intent(FirstActivity.this,MainActivity.class));
    }
    public void OnClickText(View view) {
        startActivity(new Intent(FirstActivity.this,TextReco.class));
    }
    public void OnClickLandmark(View view) {
        Toast.makeText(this, "Not created yet!!", Toast.LENGTH_SHORT).show();
    }

    public void OnClickFace(View view) {
        Toast.makeText(this, "Not created yet!!", Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onBackPressed(){

        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }else{
            super.onBackPressed();
        }

    }

     @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch(item.getItemId()){

            case R.id.nav_home:
                break;

            case R.id.nav_policy:
               // startActivity(new Intent(this,PolicyActivity.class));
                break;

            case R.id.android:

                startActivity(new Intent(this,AndroidTuto.class));
                break;
            case R.id.mlkit:
                startActivity(new Intent(this,MlKitTuto.class));

                break;
            case R.id.nav_help:
                startActivity(new Intent(this,HelpAndSupport.class));

                break;

        }

        drawerLayout.closeDrawer(GravityCompat.START);

        return true;
    }



}
