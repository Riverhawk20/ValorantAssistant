package com.app.valorantassistant;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import net.cachapa.expandablelayout.ExpandableLayout;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Information_Title#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Information_Title extends Fragment {



    public Information_Title() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Information_Title.
     */
    // TODO: Rename and change types and number of parameters
    public static Information_Title newInstance(String param1, String param2) {
        Information_Title fragment = new Information_Title();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_information__title, container, false);

        ImageView back = v.findViewById(R.id.backButtonInformation);
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

        ImageView info1 = v.findViewById(R.id.infoToggle1);
        ExpandableLayout content_1=  v.findViewById(R.id.info1);
        info1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(content_1.isExpanded()){
                    content_1.collapse();
                    info1.setImageResource(R.drawable.expandarrow);
                }
                else{
                    content_1.expand();
                    info1.setImageResource(R.drawable.rightarrow);
                }
            }
        });

        return v;
    }
}
