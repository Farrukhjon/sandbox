package io.github.farrukhjon.experiment.java.tuple;

import io.github.farrukhjon.experiment.java.sortarray.Melon;
import java.util.Comparator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        io.github.farrukhjon.experiment.java.sortarray.Melon[] melons = new io.github.farrukhjon.experiment.java.sortarray.Melon[]{
            new io.github.farrukhjon.experiment.java.sortarray.Melon("Crenshaw", 2000), new io.github.farrukhjon.experiment.java.sortarray.Melon("Gac", 1200),
            new io.github.farrukhjon.experiment.java.sortarray.Melon("Bitter", 2200), new io.github.farrukhjon.experiment.java.sortarray.Melon("Hami", 800)};
        Comparator<io.github.farrukhjon.experiment.java.sortarray.Melon> byWeight = Comparator.comparing(
            io.github.farrukhjon.experiment.java.sortarray.Melon::getWeight);

        Map.Entry<io.github.farrukhjon.experiment.java.sortarray.Melon, io.github.farrukhjon.experiment.java.sortarray.Melon> minmax1 = Bounds.arrayV1(melons, byWeight);
        System.out.println("Min (Map.Entry): " + minmax1.getKey());
        System.out.println("Max (Map.Entry): " + minmax1.getValue());

        Pair<io.github.farrukhjon.experiment.java.sortarray.Melon, Melon> minmax2 = Bounds.arrayV2(melons, byWeight);
        System.out.println("Min (Pair): " + minmax2.left);
        System.out.println("Max (Pair): " + minmax2.right);
    }

}
