package io.github.farrukhjon.experiment.java.enumeration;

import java.util.EnumMap;

public class EnumMapDemo {

    public static void main(String[] args) {
        final EnumMap<Week, Integer> enumMap = new EnumMap<>(Week.class);
        enumMap.put(Week.SATURDAY, 100);
        enumMap.put(Week.WEDNESDAY, 120);
        enumMap.put(Week.TUESDAY, 250);
        enumMap.put(Week.MONDAY, 33);
        enumMap.put(Week.THURSDAY, 785);
        enumMap.put(Week.FRIDAY, 125);
        enumMap.put(Week.SUNDAY, 352);
        System.out.println(enumMap); // Actually {SUNDAY=352, MONDAY=33, TUESDAY=250, WEDNESDAY=120, THURSDAY=785, FRIDAY=125, SATURDAY=100}
    }

    enum Week {
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY
    }

}
