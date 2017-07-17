package com.example.imran.doctorscorner;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ExpandableListView;
import android.widget.ListView;


import com.example.imran.doctorscorner.alldetails.Chittagonghos;



/**
 * A simple {@link Fragment} subclass.
 */
public class Chittagong extends Fragment  {


ArrayAdapter<String> itemc;
    public Chittagong() {
        // Required empty public constructor
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        itemc= new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1,Chittagonghos.Hospitalschit);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_chittagong, container, false);

    }





    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        ListView listvc=(ListView) view.findViewById(R.id.listemchittagong);
      listvc.setAdapter(itemc);
        listvc.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent i=new Intent(getActivity(),Chittagongdoc.class);
                        ((onitemclick)getActivity()).onclick(i);
                        break;
                    case 1:
                        Intent i1=new Intent(getActivity(),chittagongdoc2.class);
                        ((onitemclick)getActivity()).onclick(i1);
                        break;

                }
            }
        });



    }
    public  interface  onitemclick{
        void  onclick(Intent i);
    }

        }





