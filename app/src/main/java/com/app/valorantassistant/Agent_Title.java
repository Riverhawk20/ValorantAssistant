package com.app.valorantassistant;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Agent_Title#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Agent_Title extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Agent_Title() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Agent_Title.
     */
    // TODO: Rename and change types and number of parameters
    public static Agent_Title newInstance(String param1, String param2) {
        Agent_Title fragment = new Agent_Title();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_agent__title, container, false);
        ImageView back = v.findViewById(R.id.backButton);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity m = (MainActivity) getActivity();
                m.loadTitle();
            }
        });

        ImageView Breach = v.findViewById(R.id.Breach);
        Breach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity m = (MainActivity) getActivity();
                m.load_AgentInfo("Breach");
            }
        });
        ImageView Brimstone = v.findViewById(R.id.Brimstone);
        Brimstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity m = (MainActivity) getActivity();
                m.load_AgentInfo("Brimstone");
            }
        });
        ImageView Cypher = v.findViewById(R.id.Cypher);
        Cypher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity m = (MainActivity) getActivity();
                m.load_AgentInfo("Cypher");
            }
        });
        ImageView Jett = v.findViewById(R.id.Jett);
        Jett.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity m = (MainActivity) getActivity();
                m.load_AgentInfo("Jett");
            }
        });
        ImageView Omen = v.findViewById(R.id.Omen);
        Omen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity m = (MainActivity) getActivity();
                m.load_AgentInfo("Omen");
            }
        });
        ImageView Phoenix = v.findViewById(R.id.Phoenix);
        Phoenix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity m = (MainActivity) getActivity();
                m.load_AgentInfo("Phoenix");
            }
        });
        ImageView Raze = v.findViewById(R.id.Raze);
        Raze.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity m = (MainActivity) getActivity();
                m.load_AgentInfo("Raze");
            }
        });
        ImageView Sage = v.findViewById(R.id.Sage);
        Sage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity m = (MainActivity) getActivity();
                m.load_AgentInfo("Sage");
            }
        });
        ImageView Sova = v.findViewById(R.id.Sova);
        Sova.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity m = (MainActivity) getActivity();
                m.load_AgentInfo("Sova");
            }
        });
        ImageView Viper = v.findViewById(R.id.Viper);
        Viper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity m = (MainActivity) getActivity();
                m.load_AgentInfo("Viper");
            }
        });
        v.setFocusableInTouchMode(true);
        v.requestFocus();
        v.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if( keyCode == KeyEvent.KEYCODE_BACK && event.getAction() == KeyEvent.ACTION_UP) {
                    MainActivity m = (MainActivity) getActivity() ;
                    m.loadTitle();
                    return true;
                }
                return false;
            }
        });

        return v;
    }
}
