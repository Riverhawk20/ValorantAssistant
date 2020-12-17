package com.app.valorantassistant;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Map_Info#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Map_Info extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private String mapName;

    public Map_Info() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Map_Info.
     */
    // TODO: Rename and change types and number of parameters
    public static Map_Info newInstance(String param1, String param2) {
        Map_Info fragment = new Map_Info();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }
    public void endFragment() {
        getFragmentManager().beginTransaction().remove(this).commitAllowingStateLoss();

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final Bundle args = getArguments();
        mapName = args.getString("Map");
        if (mapName == null) {
            endFragment();
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_map__info, container, false);
        v.setFocusableInTouchMode(true);
        v.requestFocus();
        v.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (keyCode == KeyEvent.KEYCODE_BACK && event.getAction() == KeyEvent.ACTION_UP) {
                    MainActivity m = (MainActivity) getActivity();
                    m.loadTitleMaps();
                    endFragment();
                    return true;
                }
                return false;
            }
        });
        ImageView back = v.findViewById(R.id.backButtonMapInfo);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity m = (MainActivity) getActivity();
                m.loadTitleMaps();
                endFragment();
            }
        });
        if (mapName != null) {
            ImageView mapPicture = v.findViewById(R.id.mapPicture);
            TextView mapTitleView = v.findViewById(R.id.mapName);
            mapTitleView.setText(mapName);

            switch(mapName){
                case "bind":
                    mapPicture.setImageResource(R.drawable.bindmapmine);
                    break;
                case "haven":
                    mapPicture.setImageResource(R.drawable.havenmapmine);
                    break;
                case "split":
                    mapPicture.setImageResource(R.drawable.splitmapmine);
                    break;
            }
            DisplayMetrics displayMetrics = new DisplayMetrics();
            getActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            int width = displayMetrics.widthPixels;
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(width, width);
            mapPicture.setLayoutParams(params);

        }

        return v;
    }
}
