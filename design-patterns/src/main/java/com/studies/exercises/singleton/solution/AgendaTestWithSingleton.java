package com.studies.exercises.singleton.solution;

import com.studies.exercises.singleton.problem.Agenda;

public class AgendaTestWithSingleton {
    public static void main(String[] args) {

        reserveEAGER("Sexta");
        reserveEAGER("Sabado");

    }

    public static void reserveEAGER(String day){
        AgendaSingletonEAGER agenda = AgendaSingletonEAGER.getInstance();
        agenda.toOcuppy(day);
        System.out.println(agenda.getDays());
    }
}
