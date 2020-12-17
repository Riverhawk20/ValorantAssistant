package com.app.valorantassistant;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.Html;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Agent_Info#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Agent_Info extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public String agentName;

    public Agent_Info() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Agent_Info.
     */
    // TODO: Rename and change types and number of parameters
    public static Agent_Info newInstance(String param1, String param2) {
        Agent_Info fragment = new Agent_Info();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final Bundle args= getArguments();
        agentName = args.getString("Agent");
        if(agentName==null){
            endFragment();
        }
        else{

        }

    }
    public void endFragment(){
        getFragmentManager().beginTransaction().remove(this).commitAllowingStateLoss();

    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v =inflater.inflate(R.layout.fragment_agent__info, container, false);
        ImageView back = v.findViewById(R.id.backButtonAgentInfo);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity m = (MainActivity) getActivity();
                m.loadTitleAgent();
                endFragment();
            }
        });
        if(agentName!=null){
            //get agent
            AgentData agent = MainActivity.db.getAgent(agentName);

            //set title
            TextView title = v.findViewById(R.id.agentName);
            title.setText(agent.name);
            //set image
            ImageView pic = v.findViewById(R.id.agentPicture);
            ImageView img1 = v.findViewById(R.id.abilityImage1);
            ImageView img2 = v.findViewById(R.id.abilityImage2);
            ImageView img3 = v.findViewById(R.id.abilityImage3);
            ImageView img4 = v.findViewById(R.id.abilityImage4);
            switch (agent.name){
                case "Breach":
                    pic.setImageResource(R.drawable.breach);
                    img1.setImageResource(R.drawable.breachability1);
                    img2.setImageResource(R.drawable.breachability2);
                    img3.setImageResource(R.drawable.breachability3);
                    img4.setImageResource(R.drawable.breachability4);
                    break;
                case "Brimstone":
                    pic.setImageResource(R.drawable.brimstone);
                    img1.setImageResource(R.drawable.brimstoneability1);
                    img2.setImageResource(R.drawable.brimstoneability2);
                    img3.setImageResource(R.drawable.brimstoneability3);
                    img4.setImageResource(R.drawable.brimstoneability4);
                    break;
                case "Cypher":
                    pic.setImageResource(R.drawable.cypherpicture);
                    img1.setImageResource(R.drawable.cypherability1);
                    img2.setImageResource(R.drawable.cypherability2);
                    img3.setImageResource(R.drawable.cypherability3);
                    img4.setImageResource(R.drawable.cypherability4);
                    break;
                case "Jett":
                    pic.setImageResource(R.drawable.jett);
                    img1.setImageResource(R.drawable.jettability1);
                    img2.setImageResource(R.drawable.jettability2);
                    img3.setImageResource(R.drawable.jettability3);
                    img4.setImageResource(R.drawable.jettability4);
                    break;
                case "Omen":
                    pic.setImageResource(R.drawable.omen);
                    img1.setImageResource(R.drawable.omenability1);
                    img2.setImageResource(R.drawable.omenability2);
                    img3.setImageResource(R.drawable.omenability3);
                    img4.setImageResource(R.drawable.omenability4);
                    break;
                case "Phoenix":
                    pic.setImageResource(R.drawable.phoenix);
                    img1.setImageResource(R.drawable.phoenixability1);
                    img2.setImageResource(R.drawable.phoenixability2);
                    img3.setImageResource(R.drawable.phoenixability3);
                    img4.setImageResource(R.drawable.phoenixability4);
                    break;
                case "Raze":
                    pic.setImageResource(R.drawable.raze);
                    img1.setImageResource(R.drawable.razeability1);
                    img2.setImageResource(R.drawable.razeability2);
                    img3.setImageResource(R.drawable.razeability3);
                    img4.setImageResource(R.drawable.razeability4);
                    break;
                case "Sage":
                    pic.setImageResource(R.drawable.sage);
                    img1.setImageResource(R.drawable.sageability1);
                    img2.setImageResource(R.drawable.sageability2);
                    img3.setImageResource(R.drawable.sageability3);
                    img4.setImageResource(R.drawable.sageability4);
                    break;
                case "Sova":
                    pic.setImageResource(R.drawable.sova);
                    img1.setImageResource(R.drawable.sovaability1);
                    img2.setImageResource(R.drawable.sovaability2);
                    img3.setImageResource(R.drawable.sovaability3);
                    img4.setImageResource(R.drawable.sovaability4);
                    break;
                case "Viper":
                    pic.setImageResource(R.drawable.viper);
                    img1.setImageResource(R.drawable.viperability1);
                    img2.setImageResource(R.drawable.viperability2);
                    img3.setImageResource(R.drawable.viperability3);
                    img4.setImageResource(R.drawable.viperability4);
                    break;
                default:
            }
            //Set Type
            TextView typeView = v.findViewById(R.id.TypeText);
            String type = "<font color=#FF4655>Type: </font><font color=#EBE8E1>"+agent.type +"</font>";
            typeView.setText(Html.fromHtml(type));
            //Set Summary
            TextView summaryView = v.findViewById(R.id.SummaryText);
            summaryView.setText(agent.description);
            //Set abilities
            TextView name1, name2, name3, name4, cost1, cost2, cost3, cost4, desc1, desc2, desc3, desc4;
            name1 = v.findViewById(R.id.abilityName1);
            name1.setText(agent.abilityNames[0]);
            name2 = v.findViewById(R.id.abilityName2);
            name2.setText(agent.abilityNames[1]);
            name3 = v.findViewById(R.id.abilityName3);
            name3.setText(agent.abilityNames[2]);
            name4 = v.findViewById(R.id.abilityName4);
            name4.setText(agent.abilityNames[3]);

            cost1 = v.findViewById(R.id.abilityCost1);
            cost1.setText(Html.fromHtml("<font color=#FF4655>Cost: </font><font color=#EBE8E1>"+agent.cost[0] +" Creds</font>"));
            cost2 = v.findViewById(R.id.abilityCost2);
            cost2.setText(Html.fromHtml("<font color=#FF4655>Cost: </font><font color=#EBE8E1>"+agent.cost[1] +" Creds</font>"));
            cost3 = v.findViewById(R.id.abilityCost3);
            cost3.setText(Html.fromHtml("<font color=#FF4655>Cost: </font><font color=#EBE8E1>"+agent.cost[2] +"</font>"));
            cost4 = v.findViewById(R.id.abilityCost4);
            cost4.setText(Html.fromHtml("<font color=#FF4655>Cost: </font><font color=#EBE8E1>"+agent.cost[3] +"</font>"));

            desc1 = v.findViewById(R.id.abilityDescription1);
            desc1.setText(agent.abilityDescriptions[0]);
            desc1 = v.findViewById(R.id.abilityDescription2);
            desc1.setText(agent.abilityDescriptions[1]);
            desc1 = v.findViewById(R.id.abilityDescription3);
            desc1.setText(agent.abilityDescriptions[2]);
            desc1 = v.findViewById(R.id.abilityDescription4);
            desc1.setText(agent.abilityDescriptions[3]);

        }
        v.setFocusableInTouchMode(true);
        v.requestFocus();
        v.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if( keyCode == KeyEvent.KEYCODE_BACK && event.getAction() == KeyEvent.ACTION_UP) {
                    MainActivity m = (MainActivity) getActivity() ;
                    m.loadTitleAgent();
                    endFragment();
                    return true;
                }
                return false;
            }
        });



        // Inflate the layout for this fragment
        return v;
    }
}
