package com.app.valorantassistant;

public class WeaponData {
    String name, type, creds, magazine, wallPenetration, primaryMode, primaryRate, altMode, altRate, range1, head1, body1, legs1, range2, head2, body2, legs2, range3, head3, body3, legs3;
    public WeaponData(String NAME, String TYPE, String CREDS, String MAGAZINE, String WALLPENETRATION, String PRIMARYMODE, String PRIMARYRATE,String ALTMODE, String ALTRATE, String RANGE1, String HEAD1, String BODY1,String LEGS1, String RANGE2, String HEAD2, String BODY2,String LEGS2, String RANGE3, String HEAD3, String BODY3,String LEGS3){
        name=NAME;
        type=TYPE;
        creds=CREDS;
        magazine=MAGAZINE;
        wallPenetration=WALLPENETRATION;
        primaryMode=PRIMARYMODE;
        primaryRate=PRIMARYRATE;
        altMode=ALTMODE;
        altRate=ALTRATE;
        range1=RANGE1;
        head1=HEAD1;
        body1=BODY1;
        legs1=LEGS1;
        range2=RANGE2;
        head2=HEAD2;
        body2=BODY2;
        legs2=LEGS2;
        range3=RANGE3;
        head3=HEAD3;
        body3=BODY3;
        legs3=LEGS3;
    }
    //for knife
    public WeaponData(String NAME, String TYPE, String CREDS, String RANGE1, String HEAD1, String BODY1){
        name=NAME;
        type=TYPE;
        creds=CREDS;
        range1=RANGE1;
        head1=HEAD1;
        body1=BODY1;

    }

}
