package com.client.ui;

import com.common.Player;
import javafx.scene.effect.ColorAdjust;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Colors {
    static public Map<Player, ColorAdjust> colorAdjustMap;

    static public void Colors(ArrayList <Player> players){
        colorAdjustMap = new HashMap<>();
        ArrayList<ColorAdjust> colors = new ArrayList<>();
        ColorAdjust buf = new ColorAdjust(); buf.setHue(0.7); colors.add(buf);
        buf = new ColorAdjust(); buf.setHue(-0.2);  buf.setSaturation(0.15); colors.add(buf);
        buf = new ColorAdjust(); buf.setHue(0.15);  buf.setSaturation(0.25); colors.add(buf);
        buf = new ColorAdjust();  buf.setSaturation(-1.0); colors.add(buf);
        buf = new ColorAdjust(); buf.setHue(0.3); buf.setSaturation(0.3); colors.add(buf);
        buf = new ColorAdjust(); buf.setHue(-0.45); colors.add(buf);
        int index=0;
        for (Player player:
             players) {
            colorAdjustMap.put(player, colors.get(index));
            index++;
        }
    }

    static public ColorAdjust getColor(Player player){
        return colorAdjustMap.get(player);
    }

    static public ColorAdjust setBright(ColorAdjust colorAdjust){
        ColorAdjust buf = clone(colorAdjust);
        buf.setBrightness(0.3);
        return buf;
    }

    static public ColorAdjust setUsual(ColorAdjust colorAdjust){
        ColorAdjust buf = clone(colorAdjust);
        buf.setBrightness(0);
        buf.setSaturation(0);
        return buf;
    }

    static private ColorAdjust clone(ColorAdjust colorAdjust){
        ColorAdjust clone = new ColorAdjust();
        clone.setHue(colorAdjust.getHue());
        clone.setBrightness(colorAdjust.getBrightness());
        clone.setSaturation(colorAdjust.getSaturation());
        clone.setContrast(colorAdjust.getContrast());
        return clone;
    }

    static public ColorAdjust setBlack(ColorAdjust colorAdjust){
        ColorAdjust buf = clone(colorAdjust);
        buf.setBrightness(-0.9);
        return buf;
    }

    static public ColorAdjust setGray(ColorAdjust colorAdjust){
        ColorAdjust buf = clone(colorAdjust);
        buf.setSaturation(-1.0);
        return buf;
    }

    static public ColorAdjust setAble(ColorAdjust colorAdjust){
        ColorAdjust buf = clone(colorAdjust);
        buf.setHue(0.5);
        buf.setContrast(0.1);
        return buf;
    }
}
