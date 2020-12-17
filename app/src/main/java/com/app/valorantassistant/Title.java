package com.app.valorantassistant;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;


public class Title extends Fragment {

    TextView t;
    String some_string;


    public Title() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final Bundle args = getArguments();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_title, container, false);
        LinearLayout agents = v.findViewById(R.id.agentTitleScreen);
        agents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity m = (MainActivity) getActivity();
                m.loadTitleAgent();
            }
        });
        LinearLayout weapons = v.findViewById(R.id.weaponsTitleScreen);
        weapons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity m = (MainActivity) getActivity();
                m.loadTitleWeapons();
            }
        });
        LinearLayout maps = v.findViewById(R.id.mapTitleScreen);
        maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity m = (MainActivity) getActivity();
                m.loadTitleMaps();
            }
        });
        LinearLayout info = v.findViewById(R.id.infoTitleScreen);
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity m = (MainActivity) getActivity();
                m.loadTitleInfo();
            }
        });
        //incrment number of pages !!!!!


        // Inflate the layout for this fragment
        return v;
    }
}
