package controller;

import model.Dados;
import java.util.ArrayList;

public class Controladora {
    private ArrayList<String> resp = new ArrayList<String>();
    private Dados dados = new Dados();

    public ArrayList<String> finalAnwser(String vl1, String vl2, String vl3, String vl4) {
        try {
            resp.add(vl1);
            resp.add(vl2);
            resp.add(vl3);
            resp.add(vl4);
        } catch (Exception e) {
            System.err.println("Error" + e);
        }
        return resp;
    }

    public void saveFinalAnwser(ArrayList<String> resp) {
        dados.setResp(resp);
    }

    public void startOption(){
        String[] opcoes = {"A", "B", "C", "D", "E", "F", "G"};
        dados.setOpcoes(opcoes);
    }
}
