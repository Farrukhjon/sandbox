package io.github.farrukhjon.experiment.java.mergemaps;

import io.github.farrukhjon.experiment.java.sortarray.Melon;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        System.out.println("Merging two maps: ");
        System.out.println("---------------------------------------");

        Map<Integer, io.github.farrukhjon.experiment.java.sortarray.Melon> melons1 = new HashMap<>();
        Map<Integer, io.github.farrukhjon.experiment.java.sortarray.Melon> melons2 = new HashMap<>();

        melons1.put(1, new io.github.farrukhjon.experiment.java.sortarray.Melon("Apollo", 3000));
        melons1.put(2, new io.github.farrukhjon.experiment.java.sortarray.Melon("Jade Dew", 3500));
        melons1.put(3, new io.github.farrukhjon.experiment.java.sortarray.Melon("Cantaloupe", 1500));

        melons2.put(3, new io.github.farrukhjon.experiment.java.sortarray.Melon("Apollo", 3000));
        melons2.put(4, new io.github.farrukhjon.experiment.java.sortarray.Melon("Jade Dew", 3500));
        melons2.put(5, new io.github.farrukhjon.experiment.java.sortarray.Melon("Cantaloupe", 1500));

        Map<Integer, io.github.farrukhjon.experiment.java.sortarray.Melon> merged1 = Maps.mergeMapsV1(melons1, melons2);
        System.out.println(merged1);

        Map<Integer, Melon> merged2 = Maps.mergeMapsV2(melons1, melons2);
        System.out.println(merged2);
    }

}
