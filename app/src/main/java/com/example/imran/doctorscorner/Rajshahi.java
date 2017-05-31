package com.example.imran.doctorscorner;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.imran.doctorscorner.alldetails.rajshahihos;


/**
 * A simple {@link Fragment} subclass.
 */
public class Rajshahi extends Fragment {

    ArrayAdapter<String>  itemraj;


    public Rajshahi() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        itemraj=new ArrayAdapter<String>(getContext(),android.R.layout.simple_list_item_1, rajshahihos.hospitalraj);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_rajshahi, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {

            ListView listvc=(ListView) view.findViewById(R.id.listrajsahi);
            listvc.setAdapter(itemraj);









    }
}
