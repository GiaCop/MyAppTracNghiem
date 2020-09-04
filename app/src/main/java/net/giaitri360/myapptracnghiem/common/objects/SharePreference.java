package net.giaitri360.myapptracnghiem.common.objects;

import android.content.Context;
import android.content.SharedPreferences;

public  class SharePreference {
    public static  final String NAME_PREFS="JAVA-TEST";
   private  SharedPreferences prefs;
    public static SharePreference pref;
    public  SharePreference(Context context){
        prefs=context.getSharedPreferences(NAME_PREFS,Context.MODE_PRIVATE);

    }
    public static SharePreference getInstance(Context context){
        if(pref==null){
            return new SharePreference(context);
        }
        return pref;
    }
    public  void setPlayed(){
        SharedPreferences.Editor e=prefs.edit();
        e.putBoolean(ConStances.IS_PLAYED,true);

    }
    public boolean isPlayed(){
        return prefs.getBoolean(ConStances.IS_PLAYED,false);
//        prefs.getBoolean(ConStances)
//        e.putBoolean(ConStances.IS_PLAYED,true);
//        e.apply();

    }



}
