package com.example.buttonclick;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class fragment1 extends Fragment {

EditText e1;
Button b;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_fragment1, container, false);
           e1=v.findViewById(R.id.edit_text);
           b=v.findViewById(R.id.btnfragment);
           b.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   String name=e1.getText().toString();
                   MainActivity m=(MainActivity) getActivity();
                   m.fn(name);
               }
           });
        return v;
    }


}
