package com.studies.exercises.singleton.solution;

import com.studies.exercises.singleton.problem.Agenda;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class AgendaTestWithSingleton {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // reserveEAGER("Sexta");
        // reserveEAGER("Sabado");

        /* with this REFLECTION code we can create new instances even if the constructor is private
        Constructor<AgendaSingletonLAZY> perkyConstructor = AgendaSingletonLAZY.class.getDeclaredConstructor();
        perkyConstructor.setAccessible(true);
        AgendaSingletonLAZY perkyAgenda = perkyConstructor.newInstance();
        AgendaSingletonLAZY perkyAgenda1  = perkyConstructor.newInstance();*/

        reserveEnum("Sexta");
        reserveEnum("Sabado");

    }

    public static void reserveEAGER(String day){
        AgendaSingletonEAGER agenda = AgendaSingletonEAGER.getInstance();
        agenda.toOcuppy(day);
        System.out.println(agenda.getDays());
    }

    public static void reserveLAZY(String day){
        AgendaSingletonLAZY agenda = AgendaSingletonLAZY.getInstance();
        agenda.toOcuppy(day);
        System.out.println(agenda.getDays());
    }
    public static void reserveEnum(String day){
        AgendaSingletonEnum agenda = AgendaSingletonEnum.getInstance();
        agenda.toOcuppy(day);
        System.out.println(agenda.getDays());
    }
}
