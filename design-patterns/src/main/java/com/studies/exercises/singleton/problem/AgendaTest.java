package com.studies.exercises.singleton.problem;

public class AgendaTest {
    public static void main(String[] args) {

        reserve("Sexta");
        reserve("Sabado");

    }

    public static void reserve(String day){
        Agenda agenda = new Agenda();
        agenda.toOcuppy(day);
        System.out.println(agenda.getDays());
    }
}
