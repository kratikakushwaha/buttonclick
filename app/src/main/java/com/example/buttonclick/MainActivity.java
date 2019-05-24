package com.example.buttonclick;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity  {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction t=fragmentManager.beginTransaction();
        fragment1 f1=new fragment1();
        fragment2 f2=new fragment2();
        t.add(R.id.frag1,f1);
        t.add(R.id.frag2,f2);
        t.commit();

    }


    public void fn(String name) {
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction t1=fm.beginTransaction();
        fragment2 b1=new fragment2();
        Bundle b2=new Bundle();
        b2.putString("name",name);
        b1.setArguments(b2);
        t1.add(R.id.frag2,b1);
        t1.commit();
    }
}
