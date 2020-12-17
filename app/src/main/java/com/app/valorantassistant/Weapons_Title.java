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
 * Use the {@link Weapons_Title#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Weapons_Title extends Fragment {

    public Weapons_Title() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static Weapons_Title newInstance(String param1, String param2) {
        Weapons_Title fragment = new Weapons_Title();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_weapons__title, container, false);

        ImageView back = v.findViewById(R.id.backButtonWeapon);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity m = (MainActivity) getActivity();
                m.loadTitle();
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

        ImageView classic = v.findViewById(R.id.classic);
        classic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity m = (MainActivity) getActivity();
                m.load_WeaponInfo("classic");
            }
        });
        ImageView shorty = v.findViewById(R.id.shorty);
        shorty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity m = (MainActivity) getActivity();
                m.load_WeaponInfo("shorty");
            }
        });
        ImageView frenzy = v.findViewById(R.id.frenzy);
        frenzy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity m = (MainActivity) getActivity();
                m.load_WeaponInfo("frenzy");
            }
        });
        ImageView ghost = v.findViewById(R.id.ghost);
        ghost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity m = (MainActivity) getActivity();
                m.load_WeaponInfo("ghost");
            }
        });
        ImageView sheriff = v.findViewById(R.id.sheriff);
        sheriff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity m = (MainActivity) getActivity();
                m.load_WeaponInfo("sheriff");
            }
        });
        ImageView stinger = v.findViewById(R.id.stinger);
        stinger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity m = (MainActivity) getActivity();
                m.load_WeaponInfo("stinger");
            }
        });
        ImageView spectre = v.findViewById(R.id.spectre);
        spectre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity m = (MainActivity) getActivity();
                m.load_WeaponInfo("spectre");
            }
        });
        ImageView bulldog = v.findViewById(R.id.bulldog);
        bulldog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity m = (MainActivity) getActivity();
                m.load_WeaponInfo("bulldog");
            }
        });
        ImageView guardian = v.findViewById(R.id.guardian);
        guardian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity m = (MainActivity) getActivity();
                m.load_WeaponInfo("guardian");
            }
        });
        ImageView phantom = v.findViewById(R.id.phantom);
        phantom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity m = (MainActivity) getActivity();
                m.load_WeaponInfo("phantom");
            }
        });
        ImageView vandal = v.findViewById(R.id.vandal);
        vandal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity m = (MainActivity) getActivity();
                m.load_WeaponInfo("vandal");
            }
        });
        ImageView bucky = v.findViewById(R.id.bucky);
        bucky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity m = (MainActivity) getActivity();
                m.load_WeaponInfo("bucky");
            }
        });
        ImageView judge = v.findViewById(R.id.judge);
        judge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity m = (MainActivity) getActivity();
                m.load_WeaponInfo("judge");
            }
        });
        ImageView ares = v.findViewById(R.id.ares);
        ares.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity m = (MainActivity) getActivity();
                m.load_WeaponInfo("ares");
            }
        });
        ImageView odin = v.findViewById(R.id.odin);
        odin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity m = (MainActivity) getActivity();
                m.load_WeaponInfo("odin");
            }
        });
        ImageView marshal = v.findViewById(R.id.marshal);
        marshal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity m = (MainActivity) getActivity();
                m.load_WeaponInfo("marshal");
            }
        });
        ImageView operator = v.findViewById(R.id.operator);
        operator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity m = (MainActivity) getActivity();
                m.load_WeaponInfo("operator");
            }
        });
        ImageView knife = v.findViewById(R.id.knife);
        knife.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity m = (MainActivity) getActivity();
                m.load_WeaponInfo("tactical knife");
            }
        });

        // Inflate the layout for this fragment
        return v;
    }
}
