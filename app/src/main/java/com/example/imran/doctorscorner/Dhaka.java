package com.example.imran.doctorscorner;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.imran.doctorscorner.alldetails.Dhakahos;


/**
 * A simple {@link Fragment} subclass.
 */
public class Dhaka extends Fragment {

ArrayAdapter<String> itemd;
    public Dhaka() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        itemd=new ArrayAdapter<String>(getContext(),android.R.layout.simple_list_item_1, Dhakahos.hospitaldhaka);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dhaka, container, false);

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        ListView listvd=(ListView) view.findViewById(R.id.listemDhaka);
        listvd.setAdapter(itemd);
    }
}
