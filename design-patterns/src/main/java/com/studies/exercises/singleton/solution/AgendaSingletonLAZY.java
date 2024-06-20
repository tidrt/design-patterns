package com.studies.exercises.singleton.solution;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class AgendaSingletonLAZY {

    private static AgendaSingletonLAZY INSTANCE = null;

    private Map<String, Boolean> availableDays = new HashMap<>();

    private AgendaSingletonLAZY(){
        availableDays.put("Segunda", true);
        availableDays.put("Terça", true);
        availableDays.put("Quarta", true);
        availableDays.put("Quinta", true);
        availableDays.put("Sexta", true);
        availableDays.put("Sabado", true);
        availableDays.put("Domingo", true);
    }

    public static AgendaSingletonLAZY getInstance(){
        if(Objects.isNull(INSTANCE)){
            INSTANCE = new AgendaSingletonLAZY();
            return INSTANCE;
        }
        return INSTANCE;
    }

    public Map<String, Boolean> getDays(){
        return availableDays;
    }

    public void toOcuppy(String string){
        availableDays.replace(string, Boolean.FALSE);
    }
}
