package com.example.lottieanimationbottombar.lottiebottomnav;

public class MenuItem {

    public enum Source {
        Assets,
        Raw
    }

    FontItem fontItem;

    String selectedLottieName;
    String unselectedLottieName;

    Source lottieSource;
    float  lottieProgress;

    boolean loop;

    Object tag;

    MenuItem() {}

    public Object getTag() {
        return tag;
    }
}
