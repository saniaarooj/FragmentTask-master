package com.example.maqso.fragmenttask;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentZ extends Fragment {


    public FragmentZ() {
        // Required empty public constructor
    }

    View view;
    ListView rv;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       view = inflater.inflate(R.layout.fragment_fragment_z, container, false);
       rv = (ListView) view.findViewById(R.id.rv);
       ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i <40 ; i++) {
            list.add("Name "+ i);
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(),android.R.layout.simple_list_item_1,list);
        rv.setAdapter(adapter);
       return  view;
    }

}
