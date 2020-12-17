package com.app.valorantassistant;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PageAdapter extends FragmentPagerAdapter {
    int numberOfTabs;
    private final Bundle fragmentBundle;

    public PageAdapter(FragmentManager fm, int NumOfTabs, Bundle data) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        fragmentBundle = data;
        this.numberOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Title frag = new Title();
                frag.setArguments(this.fragmentBundle);
                return frag;
            case 1:
                Agent_Title frag1 = new Agent_Title();
                frag1.setArguments(this.fragmentBundle);
                return frag1;
            case 2:
                Agent_Info frag2 = new Agent_Info();
                frag2.setArguments(this.fragmentBundle);
                return frag2;
            case 3:
                Weapons_Title frag3 = new Weapons_Title();
                frag3.setArguments(this.fragmentBundle);
                return frag3;
            case 4:
                Information_Title frag4 = new Information_Title();
                frag4.setArguments(this.fragmentBundle);
                return frag4;
            case 5:
                Weapons_Info frag5 = new Weapons_Info();
                frag5.setArguments(this.fragmentBundle);
                return frag5;
            case 6:
                Map_Title frag6 = new Map_Title();
                frag6.setArguments(this.fragmentBundle);
                return frag6;
            case 7:
                Map_Info frag7 = new Map_Info();
                frag7.setArguments(this.fragmentBundle);
                return frag7;

            default:
                return new Title();
        }
    }

    @Override
    public int getCount() {
        return numberOfTabs;
    }
}