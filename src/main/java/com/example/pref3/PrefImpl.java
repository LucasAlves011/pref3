package com.example.pref3;

import javax.jws.WebService;

@WebService(endpointInterface = "com.example.pref3.Pref")
public class PrefImpl implements Pref {
    public String getPref() {
        return "Teste funciona";
    }
}
