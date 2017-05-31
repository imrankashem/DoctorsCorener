package com.example.imran.doctorscorner;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.imran.doctorscorner.alldetails.Chittagonghos;
import com.example.imran.doctorscorner.alldetails.kulnahos;


/**
 * A simple {@link Fragment} subclass.
 */
public class Kulna extends Fragment {
    ArrayAdapter<String> itemku;


    public Kulna() {
        // Required empty public constructor
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        itemku= new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1, kulnahos.hospitalkulna);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_kulna, container, false);
    }
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        ListView listvc=(ListView) view.findViewById(R.id.listkulna);
        listvc.setAdapter(itemku);







    }


}
