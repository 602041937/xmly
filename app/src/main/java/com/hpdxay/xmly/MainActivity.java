package com.hpdxay.xmly;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.hpdxay.xmly.fragments.HomeFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().replace(R.id.container, new HomeFragment()).commit();
    }
}
