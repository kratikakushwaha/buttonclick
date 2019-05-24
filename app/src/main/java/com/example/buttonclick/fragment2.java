package com.example.buttonclick;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class fragment2 extends Fragment {

EditText e3;

Button n;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_fragment2, container, false);
      e3=v.findViewById(R.id.edit_text1);

      Bundle c3=getArguments();
      if(c3!=null)
      {
          String name=c3.getString("name");
          e3.setText(name);
      }
        return v;
    }


}
