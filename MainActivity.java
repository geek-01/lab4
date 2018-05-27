package com.example.sagar.lab4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void audi(MenuItem item) {
    startActivity(new Intent(this,Main2Activity.class));
    }

    public void bmw(MenuItem item) {
        startActivity(new Intent(this,Main3Activity.class));
    }

    public void mercedes(MenuItem item) {
        startActivity(new Intent(this,Main4Activity.class));
    }
}
