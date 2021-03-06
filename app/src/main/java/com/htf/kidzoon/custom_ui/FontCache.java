package com.htf.kidzoon.custom_ui;

import android.content.Context;
import android.graphics.Typeface;

import java.util.HashMap;

/**
 * Created by Sahil Bharti Webmaazix Solutions on 06-12-2016.
 */

public class FontCache {

    private static HashMap<String, Typeface> fontCache = new HashMap<>();

    public static Typeface getTypeface(String fontname, Context context) {
        Typeface typeface = fontCache.get(fontname);

        if (typeface == null) {
            try {
                typeface = Typeface.createFromAsset(context.getAssets(), fontname);
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }

            fontCache.put(fontname, typeface);
        }

        return typeface;
    }
}