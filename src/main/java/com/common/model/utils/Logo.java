package com.common.model.utils;

import com.common.Player;

public class Logo extends ForImage {
    public Logo(int w, int h, String player) {
        super(0, 0, w, h, ("Logo"+player));
    }
}
