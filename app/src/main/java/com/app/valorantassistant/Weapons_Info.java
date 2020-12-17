package com.app.valorantassistant;

import android.content.Context;
import android.media.Image;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;

import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;

import android.os.Handler;
import android.text.Html;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.flexbox.FlexboxLayout;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Weapons_Info#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Weapons_Info extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private String weaponName;
    public View v;

    public Weapons_Info() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Weapons_info.
     */
    // TODO: Rename and change types and number of parameters
    public static Weapons_Info newInstance(String param1, String param2) {
        Weapons_Info fragment = new Weapons_Info();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final Bundle args = getArguments();
        weaponName = args.getString("Weapon");
        if (weaponName == null) {
            endFragment();
        }
        else{

        }
    }

    public void endFragment() {
        getFragmentManager().beginTransaction().remove(this).commitAllowingStateLoss();

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_weapons_info, container, false);
        v.setFocusableInTouchMode(true);
        v.requestFocus();
        v.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (keyCode == KeyEvent.KEYCODE_BACK && event.getAction() == KeyEvent.ACTION_UP) {
                    MainActivity m = (MainActivity) getActivity();
                    m.loadTitleWeapons();
                    endFragment();
                    return true;
                }
                return false;
            }
        });
        MainActivity m = (MainActivity) getActivity();
        ImageView back = v.findViewById(R.id.backButtonWeaponInfo);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity m = (MainActivity) getActivity();
                m.loadTitleWeapons();
                endFragment();
            }
        });
        if (weaponName != null) {
            WeaponData weapon = MainActivity.db.getWeapon(weaponName);
            m.getSkins(weaponName);
            //set title
            TextView title = v.findViewById(R.id.weaponName);
            title.setText(weapon.name);

            ImageView pic = v.findViewById(R.id.weaponPicture);
            switch (weapon.name) {
                case "Classic":
                    pic.setImageResource(R.drawable.classicpng);
                    break;
                case "Shorty":
                    pic.setImageResource(R.drawable.shorty);
                    break;
                case "Frenzy":
                    pic.setImageResource(R.drawable.frenzy);
                    break;
                case "Ghost":
                    pic.setImageResource(R.drawable.ghost);
                    break;
                case "Sheriff":
                    pic.setImageResource(R.drawable.sheriff);
                    break;
                case "Stinger":
                    pic.setImageResource(R.drawable.stinger);
                    break;
                case "Spectre":
                    pic.setImageResource(R.drawable.spectre);
                    break;
                case "Bulldog":
                    pic.setImageResource(R.drawable.bulldog);
                    break;
                case "Guardian":
                    pic.setImageResource(R.drawable.guardian);
                    break;
                case "Phantom":
                    pic.setImageResource(R.drawable.phantom);
                    break;
                case "Vandal":
                    pic.setImageResource(R.drawable.vandla);
                    break;
                case "Bucky":
                    pic.setImageResource(R.drawable.bucky);
                    break;
                case "Judge":
                    pic.setImageResource(R.drawable.judge);
                    break;
                case "Ares":
                    pic.setImageResource(R.drawable.ares);
                    break;
                case "Odin":
                    pic.setImageResource(R.drawable.odin);
                    break;
                case "Marshal":
                    pic.setImageResource(R.drawable.marshal);
                    break;
                case "Operator":
                    pic.setImageResource(R.drawable.operator);
                    break;
                case "Tactical Knife":
                    pic.setImageResource(R.drawable.knife);
                    break;
                default:
                    break;
            }
            TextView typeView, credsView, magazineView, wallPenetrationView, primaryModeView, primaryRateView, secondaryModeView, secondaryRateView, damage1View, damage2View,damge3View, range1View, range2View,range3View,altTitleView, primarySubView;

            primaryRateView = v.findViewById(R.id.PrimaryFireRateWeaponText);
            secondaryModeView = v.findViewById(R.id.SecondaryModeWeaponText);
            altTitleView = v.findViewById(R.id.alternateFire);
            secondaryRateView = v.findViewById(R.id.SecondaryFireRateWeaponText);
            range1View = v.findViewById(R.id.Damage1RangeText);
            damage1View = v.findViewById(R.id.Damage1WeaponText);
            range2View = v.findViewById(R.id.Damage2RangeText);
            damage2View = v.findViewById(R.id.Damage2WeaponText);
            range3View = v.findViewById(R.id.Damage3RangeText);
            damge3View = v.findViewById(R.id.Damage3WeaponText);
            typeView = v.findViewById(R.id.TypeTextWeapon);
            credsView = v.findViewById(R.id.CredsWeaponText);
            magazineView = v.findViewById(R.id.MagazineWeaponText);
            wallPenetrationView = v.findViewById(R.id.WallPenetrationWeaponText);
            primaryModeView = v.findViewById(R.id.PrimaryModeWeaponText);
            primarySubView=v.findViewById(R.id.primarySubtitle);

            String type = "<font color=#FF4655>Type: </font><font color=#EBE8E1>"+weapon.type +"</font>";
            typeView.setText(Html.fromHtml(type));

            String creds = "<font color=#FF4655>Creds: </font><font color=#EBE8E1>"+weapon.creds +"</font>";
            credsView.setText(Html.fromHtml(creds));
            range1View.setText(Html.fromHtml(weapon.range1));

            //if knife
            if(weapon.name=="Tactical Knife"){
                String d = "Primary " + weapon.head1 + " | Secondary " + weapon.body1 ;
                damage1View.setText(Html.fromHtml(d));

                primarySubView.setVisibility(View.GONE);
                range2View.setVisibility(View.GONE);
                damage2View.setVisibility(View.GONE);
                range3View.setVisibility(View.GONE);
                damge3View.setVisibility(View.GONE);
                magazineView.setVisibility(View.GONE);
                wallPenetrationView.setVisibility(View.GONE);
                primaryModeView.setVisibility(View.GONE);
                primaryRateView.setVisibility(View.GONE);
                altTitleView.setVisibility(View.GONE);
                secondaryModeView.setVisibility(View.GONE);
                secondaryRateView.setVisibility(View.GONE);

            }
            else{
                primarySubView.setVisibility(View.VISIBLE);
                range2View.setVisibility(View.VISIBLE);
                damage2View.setVisibility(View.VISIBLE);
                range3View.setVisibility(View.VISIBLE);
                damge3View.setVisibility(View.VISIBLE);
                magazineView.setVisibility(View.VISIBLE);
                wallPenetrationView.setVisibility(View.VISIBLE);
                primaryModeView.setVisibility(View.VISIBLE);
                primaryRateView.setVisibility(View.VISIBLE);
                altTitleView.setVisibility(View.VISIBLE);
                secondaryModeView.setVisibility(View.VISIBLE);
                secondaryRateView.setVisibility(View.VISIBLE);

                String mag = "<font color=#FF4655>Magazine: </font><font color=#EBE8E1>"+weapon.magazine +"</font>";
                magazineView.setText(Html.fromHtml(mag));

                String wall = "<font color=#FF4655>Wall Penetration: </font><font color=#EBE8E1>"+weapon.wallPenetration +"</font>";
                wallPenetrationView.setText(Html.fromHtml(wall));

                String pri = "<font color=#FF4655>Mode: </font><font color=#EBE8E1>"+weapon.primaryMode +"</font>";
                primaryModeView.setText(Html.fromHtml(pri));

                String priRate = "<font color=#FF4655>Fire Rate: </font><font color=#EBE8E1>"+weapon.primaryRate +"</font>";
                primaryRateView.setText(Html.fromHtml(priRate));

                if(weapon.altMode.length()>0){
                    altTitleView.setVisibility(View.VISIBLE);
                    secondaryModeView.setVisibility(View.VISIBLE);
                    String sec = "<font color=#FF4655>Mode: </font><font color=#EBE8E1>"+weapon.altMode +"</font>";
                    secondaryModeView.setText(Html.fromHtml(sec));
                }
                else{
                    altTitleView.setVisibility(View.GONE);
                    secondaryModeView.setVisibility(View.GONE);
                }


                if(weapon.altRate.length()>0) {
                    secondaryRateView.setVisibility(View.VISIBLE);
                    String secRate = "<font color=#FF4655>Fire Rate: </font><font color=#EBE8E1>" + weapon.altRate + "</font>";
                    secondaryRateView.setText(Html.fromHtml(secRate));
                }
                else{
                    secondaryRateView.setVisibility(View.GONE);
                }
                String d;


                d = "Body " + weapon.head1 + " | Head " + weapon.body1 + " | Leg " + weapon.legs1;
                damage1View.setText(Html.fromHtml(d));


                if(weapon.range2.length()>0){
                    range2View.setVisibility(View.VISIBLE);
                    damage2View.setVisibility(View.VISIBLE);
                    range2View.setText(Html.fromHtml(weapon.range2));
                    d = "Body " + weapon.head2 + " | Head " + weapon.body2 + " | Leg " + weapon.legs2;
                    damage2View.setText(Html.fromHtml(d));
                }
                else{
                    range2View.setVisibility(View.GONE);
                    damage2View.setVisibility(View.GONE);
                }

                if(weapon.range3.length()>0){
                    range3View.setVisibility(View.VISIBLE);
                    damge3View.setVisibility(View.VISIBLE);
                    range3View.setText(Html.fromHtml(weapon.range3));
                    d = "Body " + weapon.head3 + " | Head " + weapon.body3 + " | Leg " + weapon.legs3;
                    damge3View.setText(Html.fromHtml(d));
                }
                else{
                    range3View.setVisibility(View.GONE);
                    damge3View.setVisibility(View.GONE);
                }
            }
            /*
            FlexboxLayout skins = v.findViewById(R.id.skinFlexBox);
            ArrayList<ImageView> skinImages =  m.getSkins(weaponName);
            for(ImageView i : skinImages){
                FlexboxLayout.LayoutParams params = new FlexboxLayout.LayoutParams(150, 150);
                i.setLayoutParams(params);
                skins.addView(i);
            }
            */
            if(!isOnline()){
                float factor = this.getResources().getDisplayMetrics().density;
                LinearLayout s = v.findViewById(R.id.skinLayoutContainer);
                s.removeAllViews();
                TextView skinName = new TextView(getContext());
                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
                skinName.setText("**You need internet connection to load skins**");
                skinName.setGravity(Gravity.CENTER);
                params.setMargins(0, (int)(10*factor), 0, (int)(5*factor));
                skinName.setTypeface(ResourcesCompat.getFont(getContext(),R.font.valorantfont));
                skinName.setTextSize(TypedValue.COMPLEX_UNIT_SP, 12);
                skinName.setTextColor(getResources().getColor(R.color.valorantWhite));
                skinName.setLayoutParams(params);
                s.addView(skinName);

            }








        }
        return v;
    }
    public boolean isOnline() {
        ConnectivityManager connMgr = (ConnectivityManager)getActivity().
                getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
        return (networkInfo != null && networkInfo.isConnected());
    }
}
