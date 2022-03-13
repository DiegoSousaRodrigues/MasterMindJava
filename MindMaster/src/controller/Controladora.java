package controller;

import java.util.ArrayList;

public class Controladora {
    private ArrayList<String> resp = new ArrayList<String>();

    public void FinalAnwser(String vl1, String vl2, String vl3, String vl4) {
        resp.add(vl1);
        resp.add(vl2);
        resp.add(vl3);
        resp.add(vl4);
    }
}
