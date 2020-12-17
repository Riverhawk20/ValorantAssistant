package com.app.valorantassistant;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.graphics.Typeface;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.util.TypedValue;
import android.view.Gravity;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.Resource;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.ListResult;
import com.google.firebase.storage.StorageReference;
import com.mopub.common.MoPub;
import com.mopub.common.SdkConfiguration;
import com.mopub.common.SdkInitializationListener;
import com.mopub.mobileads.MoPubView;


public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private PageAdapter adapter;
    private final int NUM_PAGES = 8;
    private final String BANNER_ID = "5f19bf64fd3e44349143c57aaf0acc4b";
    public static Database db = new Database();
    private MoPubView moPubView;
    StorageReference storageRef;
    FirebaseStorage storage;
    public boolean textRemoved;
    Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.pager);
        loadTitle();
        context = this;

        MoPub.onCreate(this);
        SdkConfiguration sdkConfiguration = new SdkConfiguration.Builder(BANNER_ID)
                .build();
        MoPub.initializeSdk(this, sdkConfiguration, new SdkInitializationListener() {
            @Override
            public void onInitializationFinished() {
            }
        });
        moPubView = (MoPubView) findViewById(R.id.banner);
        moPubView.setAdUnitId(BANNER_ID);
        Handler myHandler = new Handler();
        myHandler.postDelayed(new Runnable() {
            public void run() {
                moPubView.loadAd();
            }
        }, 3000);
    }

    public void getSkins(String weaponName) {
        float factor = this.getResources().getDisplayMetrics().density;
        int width = this.getResources().getDisplayMetrics().widthPixels;
        if (isOnline()) {
            storage = FirebaseStorage.getInstance();
            storageRef = storage.getReference().child("skins").child(weaponName);
            storageRef.listAll().addOnSuccessListener(new OnSuccessListener<ListResult>() {
                @Override
                public void onSuccess(ListResult listResult) {
                    LinearLayout skins = findViewById(R.id.skinFlexBox);
                    textRemoved = false;
                    for (StorageReference item : listResult.getItems()) {
                        item.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                            @Override
                            public void onSuccess(Uri uri) {
                                if (!textRemoved) {
                                    skins.removeAllViews();
                                    textRemoved = true;
                                }
                                String name = uri.toString();
                                int start = name.indexOf("skins%2")+7 + weaponName.length() + 4;
                                int end = name.indexOf("?alt")-4;
                                String weaponName = name.substring(start,end);
                                weaponName=weaponName.replaceAll("%2F", " ");
                                weaponName=weaponName.replaceAll("2F", " ");
                                weaponName=weaponName.replaceAll("%20", " ");

                                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
                                params.setMargins((int)(5*factor), (int)(10*factor), (int)(5*factor), (int)(5*factor));
                                TextView skinName = new TextView(context);
                                skinName.setGravity(Gravity.CENTER);
                                skinName.setTypeface(ResourcesCompat.getFont(context,R.font.valorantfont));
                                skinName.setTextSize(TypedValue.COMPLEX_UNIT_SP, 17);
                                skinName.setTextColor(getResources().getColor(R.color.valorantWhite));
                                skinName.setText(weaponName);
                                skinName.setLayoutParams(params);

                                ImageView loadedSkin = new ImageView(context);
                                loadedSkin.setPadding(8, 5, 8, 5);
                                loadedSkin.setBackground(getDrawable(R.drawable.border));
                                Glide.with(context).load(uri).into(loadedSkin);
                                params = new LinearLayout.LayoutParams(width, LinearLayout.LayoutParams.WRAP_CONTENT);
                                loadedSkin.setMaxWidth((int) (factor * 512));
                                loadedSkin.setMaxHeight((int) (factor * 150));
                                loadedSkin.setAdjustViewBounds(true);
                                loadedSkin.setLayoutParams(params);

                                skins.addView(skinName);
                                skins.addView(loadedSkin);

                            }
                        });
                    }
                }
            });
        }

    }

    public void load_AgentInfo(String agent) {
        Bundle bundle = new Bundle();
        bundle.putString("Agent", agent);
        adapter = new PageAdapter(getSupportFragmentManager(), NUM_PAGES, bundle);
        viewPager.setAdapter(adapter);
        viewPager.setCurrentItem(2);
    }

    public void load_WeaponInfo(String weapon) {
        Bundle bundle = new Bundle();
        bundle.putString("Weapon", weapon);
        adapter = new PageAdapter(getSupportFragmentManager(), NUM_PAGES, bundle);
        viewPager.setAdapter(adapter);
        viewPager.setCurrentItem(5);
    }

    public void load_MapInfo(String map) {
        Bundle bundle = new Bundle();
        bundle.putString("Map", map);
        adapter = new PageAdapter(getSupportFragmentManager(), NUM_PAGES, bundle);
        viewPager.setAdapter(adapter);
        viewPager.setCurrentItem(7);
    }


    public void loadTitle() {
        Bundle bundle = new Bundle();
        adapter = new PageAdapter(getSupportFragmentManager(), NUM_PAGES, bundle);
        viewPager.setAdapter(adapter);
        viewPager.setCurrentItem(0);
    }

    public void loadTitleAgent() {
        Bundle bundle = new Bundle();
        adapter = new PageAdapter(getSupportFragmentManager(), NUM_PAGES, bundle);
        viewPager.setAdapter(adapter);
        viewPager.setCurrentItem(1);
    }

    public void loadTitleWeapons() {
        Bundle bundle = new Bundle();
        adapter = new PageAdapter(getSupportFragmentManager(), NUM_PAGES, bundle);
        viewPager.setAdapter(adapter);
        viewPager.setCurrentItem(3);
    }

    public void loadTitleMaps() {
        Bundle bundle = new Bundle();
        adapter = new PageAdapter(getSupportFragmentManager(), NUM_PAGES, bundle);
        viewPager.setAdapter(adapter);
        viewPager.setCurrentItem(6);
    }
    public void loadTitleInfo() {
        Bundle bundle = new Bundle();
        adapter = new PageAdapter(getSupportFragmentManager(), NUM_PAGES, bundle);
        viewPager.setAdapter(adapter);
        viewPager.setCurrentItem(4);
    }


    public boolean isOnline() {
        ConnectivityManager connMgr = (ConnectivityManager)
                getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
        return (networkInfo != null && networkInfo.isConnected());
    }
    @Override
    protected void onDestroy() {

        if ( moPubView != null ){
            moPubView.destroy();
        }
        super.onDestroy();
    }
}
