package model;

import java.util.ArrayList;

public class Dados {
    private ArrayList<String> resp = new ArrayList<String>();
    private ArrayList<String> option = new ArrayList<String>();

    public void setResp(ArrayList<String> resp) {
        this.resp = resp;
    }

    public void setOpcoes(String[] value) {
        for(int i = 0; i < 7;  i++){
            option.add(value[i]);
            System.out.println(value[i]);
        }
    }

    public ArrayList<String> getPassword() {
        return option;
    }
}
