package com.example.maqso.fragmenttask;


import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FragmentReplace extends AppCompatActivity {

    FragmentTransaction ft;
    FragmentManager fm;
    Button btnZ, btnY;
    FragmentY fragmentY;
    FragmentZ fragmentZ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_replace);
        fragmentY = new FragmentY();
        fragmentZ = new FragmentZ();
        fm = getSupportFragmentManager();
        ft = fm.beginTransaction();
        ft.replace(R.id.fragment_container, fragmentZ);
        ft.commit();

        btnZ = (Button) findViewById(R.id.btnZ);
        btnY = (Button) findViewById(R.id.btnY);
        btnZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ft = fm.beginTransaction();
                ft.replace(R.id.fragment_container, new FragmentZ());
                ft.addToBackStack(null);
                ft.commit();
            }
        });

        btnY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ft = fm.beginTransaction();
                ft.replace(R.id.fragment_container, new FragmentY());
                ft.addToBackStack(null);
                ft.commit();
            }
        });

    }


}
