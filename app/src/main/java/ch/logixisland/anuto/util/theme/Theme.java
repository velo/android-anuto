package ch.logixisland.anuto.util.theme;

import android.graphics.Bitmap;
import android.graphics.Color;

/**
 * Created by tom klietherems on 10/18/16.
 */

public class Theme {

    public static final int LightTheme = 0;
    public static final int DarkTheme = 1;


    protected int foregroundColor = Color.BLACK;
    protected int backgroundColor = Color.WHITE;

    protected int textColor = Color.BLACK;
    protected int textBackgroundColor = Color.WHITE;

    protected int altBackgroundColor = Color.DKGRAY;

    public int getForegroundColor() {
        return foregroundColor;
    }

    public int getBackgroundColor() {
        return backgroundColor;
    }

    public int getTextColor() {
        return textColor;
    }

    public int getTextBackgroundColor() {
        return textBackgroundColor;
    }

    //public static  int textBackgroundColor = Color.BLACK;
    //public static  int HEALTHBARBD = Color.DKGRAY;

    public int resourceMap(int id) { return id; }


    public int getAltBackgroundColor() {
        return altBackgroundColor;
    }

}
