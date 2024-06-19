package com.studies.exercises.singleton.problem;

import java.util.HashMap;
import java.util.Map;

public class Agenda {

    private Map<String, Boolean> availableDays = new HashMap<>();

    public Agenda(){
        availableDays.put("Segunda", true);
        availableDays.put("Terça", true);
        availableDays.put("Quarta", true);
        availableDays.put("Quinta", true);
        availableDays.put("Sexta", true);
        availableDays.put("Sabado", true);
        availableDays.put("Domingo", true);
    }

    public Map<String, Boolean> getDays(){
        return availableDays;
    }

    public void toOcuppy(String string){
        availableDays.replace(string, Boolean.FALSE);
    }
}
