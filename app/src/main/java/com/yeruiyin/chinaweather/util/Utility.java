package com.yeruiyin.chinaweather.util;

import android.text.TextUtils;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by yeruiyin on 2017/5/19.
 */
public class Utility {
    /**
     * 解析和处理服务器返回的省级数据
     * @param response
     * @return
     */
    public static boolean handleProvinceResponse(String response){
        if (!TextUtils.isEmpty(response)){
            try {
                JSONArray allProvinces=new JSONArray(response);
                for (int i=0;i<allProvinces.length();i++){
                    JSONObject provinceObject=allProvinces.getJSONObject(i);

                }

            } catch (JSONException e) {
                e.printStackTrace();
            }
            return false;
        }

    public static boolean handleCityResponse(String response){
        if (!TextUtils.isEmpty(response)){
            try {
                JSONArray allCities=new JSONArray(response);
                for (int i=0;i<allCities.length();i++){
                    JSONObject cityObject=allCities.getJSONObject(i);

                }

            } catch (JSONException e) {
                e.printStackTrace();
            }
            return false;
        }
    public static boolean handleCountryResponse(String response){
        if (!TextUtils.isEmpty(response)){
            try {
                JSONArray allCountries=new JSONArray(response);
                for (int i=0;i<allCountries.length();i++){
                    JSONObject countryObject=allCountries.getJSONObject(i);

                }

            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        return  false;
    }
}
