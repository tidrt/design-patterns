package com.studies.exercises.singleton.solution;

import java.util.HashMap;
import java.util.Map;

public class AgendaSingletonEAGER {

    private static final AgendaSingletonEAGER INSTANCE = new AgendaSingletonEAGER();

    private Map<String, Boolean> availableDays = new HashMap<>();

    private AgendaSingletonEAGER(){
        availableDays.put("Segunda", true);
        availableDays.put("Terça", true);
        availableDays.put("Quarta", true);
        availableDays.put("Quinta", true);
        availableDays.put("Sexta", true);
        availableDays.put("Sabado", true);
        availableDays.put("Domingo", true);
    }

    public static AgendaSingletonEAGER getInstance(){
        return INSTANCE;
    }

    public Map<String, Boolean> getDays(){
        return availableDays;
    }

    public void toOcuppy(String string){
        availableDays.replace(string, Boolean.FALSE);
    }
}
